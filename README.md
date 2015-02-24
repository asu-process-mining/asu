![ASU](https://commguide.asu.edu/files/endorsed/color/ASUWPC_RGB.png)

# Product Usage Mining- A Research Agenda for Data Driven Product Design and Evaluation


## Project Overview

Event logs in systems can be used to create visualization models for describing dominant usage patterns, predicting behavior and dynamically adapt and customize user interfaces. Mining event sequences using innovative graph mining techniques is an emerging discipline and draws from Information Systems and Computer Science disciplines. In a nutshell, mined event sequences from event logs can help model relations among events and user actions (such as page views, menu usage sequence, product views in a catalog, etc.). Related applications included analyses of event logs from CRM systems or other information systems which contain events that can be used to build a model of a multi-event process. These models can be used for exploratory data analysis or to compare actual event data to an ideal model.

## Research Project Overview

Our project seeks to add to the work done in the general areas of graph mining, event sequence analyses and process mining by focusing on event stream mining as a means to better understand the use of digital products like Software as a Service (SaaS). Specifically, we are interested in developing new mining techniques to understand the value co-creation processes between SaaS providers and their users. To this end, there are several unique elements and contributions we hope to make to both practice and academic research in this area. 


  -Our technical approach is based on current Big Data technologies which
  allow for parallel and distributed processing in the cloud rather than
  the current mining tools that are desktop applications. We want to develop
  our work to enable mining techniques to be employed with 
  "web scale" datasets.

  -Our first research dataset was generated by a SaaS using the JSON Activity
  Streams [**specification**][streams] which is an increasingly common format for
  SaaS user event logging. We hope to provide insight into how such general
  formats can easily be used as inputs into a "web scale" data set analysis.

  -We plan to build our analysis pipeline and tools using the Python programming
  language. [**Python**][python] and its [**SciPy**][scipy] ecosystem of mathematics,
  science, and engineering libraries are increasingly being used in both
  practice and research when doing data mining and analysis on large and diverse 
  datasets.

  -We plan to contribute any libraries, frameworks, or approaches we develop
  to the open source community under a BSD license. 

  -Our research dataset includes 10's of millions of events generated by
  10's of thousands of users nested in multiple organizations. The dataset 
  includes both user and system generated events. We hope that the challenges 
  of this dataset will enable us to better address user logs from SaaS products 
  that have millions of users and exponentially increasing numbers of events.

  -Our dataset spans 2.5 years during which time several major product enhancements 
  were deployed. We hope this long span of time and large number of end users will 
  allow us to explore issues of value co-creation processes between users and a SaaS 
  offering.


[process-mining]: http://www.processmining.org/
[book]: http://www.processmining.org/book/start
[streams]: http://www.w3.org/TR/2015/WD-activitystreams-core-20150129/
[python]: https://www.python.org/
[scipy]: http://www.scipy.org/
[raghu]: http://my.wpcarey.asu.edu/directory/people/profile.cfm?person=1039602
[pandas]: https://github.com/pydata/pandas/


## The Team

[**Raghu Santanam**][raghu] is a professor of Information Systems at Arizona State University in the
W. P. Carey School of Business and the principal investigator for this 
project.

**Sean Schaefer** is a research engineer who works as a software developer
at a large multi-national. Sean has contributed to the Python [**pandas**][pandas]
project and worked with a variety of big data technologies. Sean graduated with honors 
from the ASU computer science program in the Ira A. Fulton Engineering School. 

**Collin Sellman** is a data scientist for a large multi-national and a visiting
researcher at ASU. Collin is focused on how to use data to improve digital products 
and services.

**Abhijeet Srivastava** is a graduate student in computer science at ASU in the 
Ira A. Fulton Engineering school and a researcher in the Department of Information 
Systems under Dr. Santanam.

