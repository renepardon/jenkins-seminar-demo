pipeline {
    agent any
    stages {
      stage('Stage1') {
          steps {
              sh 'echo Hallo Welt.'
          }
      }
      stage('Stage2') {
          steps {
              sh 'echo echoWelt2()'
          }
      }
    }
}

def echoWelt2() {
   return "Hallo zweite Welt."
}
