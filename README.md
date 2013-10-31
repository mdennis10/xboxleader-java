xboxleader-java
===============

Java wrapper for xboxleaders.com to get data from Xbox Live

## Description

#### Sample Source:

xboxleader:

     XboxLeader xboxLeader = new XboxLeader ();
     Profile profile = xboxLeader.getProfile(gamerTag);
     
Mashape:

     XboxLeader xboxLeader = new XboxLeader (api);
     Profile profile = xboxLeader.getProfile(gamerTag);
     
#### Api methods Covered
  getProfile (String gamerTag)
  getGame (String gamerTag)
  getAchievement (String gamerTag,String gameId)
  getFriend (String gamerTag)
  getRegion ()
  setRegion (Region region)
 
 ## Necessary prerequisites
  Java 1.5 or higher,Gson,Apache HttpClient,Maven
 
 
 #### Building the source
  Sources can be built using Maven. The POM.xml contains all dependency required.
