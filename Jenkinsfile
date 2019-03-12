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
              println library.getBranchName(env)
            }else
            {
              println 'DU NULL'
            }
          }
        }
      }
    }
}
