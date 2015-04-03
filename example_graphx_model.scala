//start shell
//./bin/spark-shell --master local[4]
import org.apache.spark._
import org.apache.spark.graphx._
import org.apache.spark.rdd.RDD

val nodes: RDD[(VertexId, (String, String))] =
  sc.parallelize(Array((1L, ("User A", "actor")), (2L, ("User B", "actor")),
                       (3L, ("User C", "actor")), (4L, ("User D", "actor")),
                       (5L, ("Opened", "verb")), (6L, ("Loggedin", "verb")),
                       (7L, ("Loggedout", "verb")), (8L, ("Liked", "verb")),
                       (9L, ("Video A", "object")), (10L, ("Video B", "object")),
                       (11L, ("Video C", "object")), (12L, ("Video D", "object"))))

val edges: RDD[Edge[(Long, String)]] =
  sc.parallelize(Array(Edge(1L, 6L, (1L, "T1")), Edge(1L, 5L, (1L, "T2")),
                       Edge(5L, 9L, (1L, "T2")), Edge(2L, 5L, (2l, "T1")),
                       Edge(3L, 6L, (3L, "T1")), Edge(3L, 8L, (3L, "T2")),
                       Edge(8L, 10L, (3L, "T2")), Edge(3L, 7L, (3L, "T3")),
                       Edge(4L, 7L, (4L, "T1"))))

val graph = Graph(nodes, edges)

graph.vertices.filter{case(id, (name, kind)) => name == "User A"}.count

val statements: RDD[String] =
  graph.triplets.map(triplet =>
    triplet.srcAttr._1 + " went to " + triplet.dstAttr._1 + " at time " +
     triplet.attr._2 + " with the user identified as node " + triplet.attr._1)

statements.collect.foreach(println(_))

