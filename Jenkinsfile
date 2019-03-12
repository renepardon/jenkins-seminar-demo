pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    checkout scm
    stages {
        stage('Build Image') {
            steps {
                sh 'docker build -t jenkinsseminar/demo:branch-2'
            }
        }
    }
}
