pipeline {
  agent any
  triggers {
    cron('* * * * *')
  }
  stages {
    stage("local") {
      steps {
        echo 'Hello world'
      }
    }
  }
}
