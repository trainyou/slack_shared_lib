def call() {  
  pipeline{
    stages {
      stage('slack_notification'){
        steps {
          script{
            post {
              always{
                sh "echo ${BUILD_NUMBER}"
              }
            }
          }
        }
      }
    }
  }
}
