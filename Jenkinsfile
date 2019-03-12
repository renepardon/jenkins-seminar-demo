pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stages {
      stage(Checkout') {
        steps {
          checkout scm
        }        
      }
      stage('Build Image') {
          steps {
              sh 'docker build -t jenkinsseminar/demo:branch-2'
          }
      }
    }
}
