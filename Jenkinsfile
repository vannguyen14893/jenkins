
node {
       stage('Clone') {
           git url: 'https://github.com/vannguyen14893/jenkins.git'
       }
       stage('Build') {
            cmd 'mvn clean install -f jenkins/pom.xml'
       }
}
