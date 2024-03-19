def slackNotify(){
  success {
    slackSend channel:'#jenkins-for-now', color: '#71E600', message: "$env.JOB_NAME -->$env.BUILD_NUMBER"
  }
  failure {
    slackSend channel:'#jenkins-for-now', color: '#BF3A00', message: "$env.JOB_NAME --> $env.BUILD_NUMBER"
  }
}
