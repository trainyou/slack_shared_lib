def call() {  
  pipeline{
    stages {
      stage('slack_notification'){
        steps {
          script{
            sh "echo ${BUILD_NUMBER}"
          }
        }
      }
    }
  }
}
