pipeline {
    agent any
    stages {
      stage('Stage1') {
          steps {
              sh 'echo Hallo Welt.'
          }
      }
      stage('Stage2') {
          steps {
              script {
                pipefuncs = load "./functions.groovy"
                sh "echo $pipefuncs"
                output = pipefuncs.echoWelt2()
                sh "echo $output"
              }
          }
      }
    }
}
