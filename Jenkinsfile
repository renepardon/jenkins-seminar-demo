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
              def output = echoWelt()
              sh 'echo $output'
          }
      }
    }
}

def echoWelt2() {
   return "Hallo zweite Welt."
}
