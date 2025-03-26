#!/bin/bash
cd "$(dirname "$0")"
if [ $# -eq 0 ]
  then
    java -Xmx2G -Xms1G -jar ./quarkus-run.jar
  else
  	java -Xmx2G -Xms1G -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:$1 -jar ./quarkus-run.jar
fi
