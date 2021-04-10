pipeline {
  agent any
  stages {
  stage('Stage 1') {
      steps {
        script {
          git url: 'https://github.com/vannguyen14893/jenkins.git'
        }
      }
    }
  stage('Stage 2') {
      steps {
        script {
          sh 'mvn clean install -f jenkin_pipe/pom.xml'
        }
      }
    }
  }
}
