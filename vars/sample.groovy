def call() {  
  pipeline{
    script{
      sh "echo ${BUILD_NUMBER}"
    }
  }
