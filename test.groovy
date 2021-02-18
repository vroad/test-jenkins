pipeline {
  agent any
  stages {
    stage("local") {
      steps {
        echo 'Hello world 3'
      }
    }
  }
}
