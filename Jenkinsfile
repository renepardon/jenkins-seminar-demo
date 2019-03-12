pipeline {
    agent any
    def library = load(Function)
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
          sh 'echo $library.getBranchName()'
        }
      }
    }
}
