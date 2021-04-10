pipeline {
  agent any
  stages {
  stage('Stage 1') {
      steps {
        script {
          git url: 'https://github.com/jfrogdev/project-examples.git'
        }
      }
    }
  stage('Stage 2') {
      steps {
        script {
          sh 'mvn clean install -f jenkins/pom.xml'
        }
      }
    }
  }
}
