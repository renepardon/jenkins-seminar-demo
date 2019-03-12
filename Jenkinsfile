pipeline {

  agent any

  environment {
    registry = "renepardon/jenkinsseminar-demo"
    registryCredential = 'docker-hub-credentials'
    dockerImage = ''
  }

  stages {
    stage ('Checkout' ) {
		steps {
			checkout scm;
			def library = load "Function.groovy";
			sh 'echo Test'
			sh 'echo library.getBranchName'
		}
	}
	
	/*		
    stage ('Test') {
        agent {
          dockerfile {
              filename 'Dockerfile'
              dir '.'
          }
        } 
        steps {
            sh 'echo install dependencies'
            sh 'echo execute our tests'

            // sh 'cp index.html test.html'
        }
    }

    stage('Build Image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER-${getDashedBranchName()}"
        }
      }
    }

    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }

    }

    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER-${getDashedBranchName()}"
      }
    }
	*/
  }
  /*
  post {
      always {
          echo 'here we could send a mail or slack/mattermost notification'
      }
  }
  */
}

def getBranchName() {
    return env.BRANCH_NAME
}

/**
 * @return the part of the branch name after the slash
 */
def getSimpleBranchName() {
    return getBranchName().substring(getBranchName().lastIndexOf('/') + 1)
}

/**
 * @return the branch name splitted with dashes instead of slashes
 */
def getDashedBranchName() {
    return getBranchName().replace("/", "-")
}
