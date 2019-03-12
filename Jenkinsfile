pipeline {
    agent none
    stages {
      stage ('checkout')
      {
        checkout scm  
      }

    }
    //
    // stages {
    //     stage('Test PHP 5.4') {
    //       agent { docker 'php:5.4-alpine' }
    //       steps {
    //         script {
    //             sh 'composer install'
    //             sh './vendor/bin/phpunit'
    //         }
    //       }
    //     }
    //
    //     stage('Test PHP 7.3') {
    //       agent { docker 'php:7.3-alpine' }
    //       steps {
    //         script {
    //             sh 'composer install'
    //             sh './vendor/bin/phpunit'
    //         }
    //       }
    //     }
    // }
}
