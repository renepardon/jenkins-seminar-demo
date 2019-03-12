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
            script{
            def library = load("Function.groovy")
            sh 'echo Test'
            if (library != Null) {
              def message = library.getBranchName()
              println '$message'
            }else
            {
              println 'DU NULL'
            }
          }
        }
      }
    }
}
