def call() {
  post {
    always{
      sh "echo ${BUILD_NUMBER}"
    }
  }
}
