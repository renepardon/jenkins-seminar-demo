pipeline {
    agent any
    library 'Functions'
    stages {
      stage ('checkout')
      {
        steps {
          checkout scm
        }
      }
      stage('Build') {
        steps {
          sh 'echo Test'
        }
      }
    }
}
