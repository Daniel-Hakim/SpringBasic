pipeline {

agent any
 tools {
        maven 'Maven_3.5.2'
    }
stages {
    stage('Compile Stage') {

	    steps {

		bat 'mvn clean compile'

		      }
		}

	 stage('Testing Stage') {

	    steps {

    		bat 'mvn test'

    		      }
    		}


	 stage('Deployment Stage') {

    	    steps {

        		bat 'mvn deploy'

        		      }
        		}

     }
}