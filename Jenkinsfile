pipeline {
    agent {
      docker {image 'node:7-alpine'}
    }
    stages {
      stage ('checkout')
      {
        steps {
          checkout scm
        }
      }
      stage('Build') {
        steps {
          sh 'echo 'Test''
        }
      }
    }
}
