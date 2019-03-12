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
          script {
          def library = load("Function.groovy")
          sh 'echo Test'
          def message = library.getBranchName()
          // println '$message'
        }
      }
    }
  }
}
