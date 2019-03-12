pipeline {
    agent any
    import Funcitons
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
