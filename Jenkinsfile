pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/frusteee/TestNG.git', branch: 'main')
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