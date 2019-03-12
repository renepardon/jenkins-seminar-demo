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
            def library = load "Function.groovy"
            sh 'echo Test'
            println library.getBranchName(env)
          }
        }
      }
    }
}
