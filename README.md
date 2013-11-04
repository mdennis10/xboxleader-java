xboxleader-java
===============

Java wrapper for [xboxleader](http://xboxleaders.com/) to get data from Xbox Live. This wrapper
support Java SE, Java EE, Android and Blackberry applications.[Note] Use asynchronous methods for
Android and Blackberry support.

## Description

#### Sample Source:

xboxleader:

     XboxLeader xboxLeader = new XboxLeader ();
     Profile profile = xboxLeader.getProfile(gamerTag);
     
     
Mashape:

     XboxLeader xboxLeader = new XboxLeader (api);
     Profile profile = xboxLeader.getProfile(gamerTag);
     
Asychronous:

     xboxLeader.getProfile(gamerTag,new ResultListener<Profile> (){
          public void response (Profile profile)
          {
               //Do sometime with data returned
          }
     });
     
#### Api methods Covered

  
##Links
  Learn About API: https://www.xboxleaders.com/
  
  Learn About Mashape: https://www.mashape.com/xboxleaders/XboxLeadersAPI
 
 
 
## Necessary prerequisites
 Java 1.5 or higher,Gson,Apache HttpClient,Maven
 
 
#### Building the source
 Sources can be built using Maven. The POM.xml contains all dependency required.
