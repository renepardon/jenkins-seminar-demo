pipeline {
    agent any

    stages {

	    stage( 'Checkout' )  {
			steps {
				checkout scm;
			}
		}
		
		stage( 'Build Docker' )  {
			steps {
			    checkout scm;
				// sh './jenkins/jenkins_docker.sh';
			}
		}
		
		stage( 'Deploy Docker' )  {
			steps {
				checkout scm;
			}
		}
    }
}
