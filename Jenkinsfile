pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
		git([url: 'https://github.com/frusteee/spring-petclinic.git', branch: 'main', credentialsId: '7050e0cd-7029-485c-b583-ffa088320d9e'])
      }
    }

    stage('RunRegression') {
      parallel {
        stage('RunRegression') {
          steps {
            bat 'mvn test -P Regression'
          }
        }

        stage('RunSmoke') {
          steps {
            bat 'mvn test -P Smoke'
          }
        }

      }
    }

    stage('Send Notifcation') {
      steps {
        emailext(subject: 'TestNG MultiBranch ', body: 'Build Success', from: 'jenkins21291@gmail.com', replyTo: 'jenkins21291@gmail.com', to: 'jenkins21291@gmail.com')
      }
    }

  }
}