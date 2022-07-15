@Library('javatest') _

pipeline{
    agent any
    stages {
        stage('build') {
            steps{
                build("manish tiwari")
                script {
                  pwd
                  build.build("test")
                }
            }
        }
    }
}
