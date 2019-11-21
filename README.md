Migration Status
- JDK8:
TODOs: Upgrade Libs
 - Mockito
 
JDK 11
neod to compile with:
<configuration>
          <target>11</target>
          <source>11</source>
          instead of
          <release>11</release>
       because of addexports