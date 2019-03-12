#!/bin/bash

JENKINS_CRUMB=`curl "http://127.0.0.1:8080/crumbIssuer/api/xml?xpath=concat(//crumbRequestField,\":\",//crumb)"`
echo $JENKINS_CRUMB
curl -X POST -H $JENKINS_CRUMB -F "jenkinsfile=<Jenkinsfile" http://127.0.0.1:8080/pipeline-model-converter/validate

