pipeline {
    agent any
    stages {
      stage ('checkout')
      {
        steps {
          checkout scm
        }
      }
      stage('Build') {
        steps {
          def library = load(Function)
          sh 'echo Test'
          sh 'echo $library.getBranchName()'
        }
      }
    }
}
