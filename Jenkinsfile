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
              script {
                output = echoWelt2()
              }
              sh 'echo $output'
          }
      }
    }
}

def echoWelt2() {
   return "Hallo zweite Welt."
}
