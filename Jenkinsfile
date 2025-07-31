pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'  // Set this in Jenkins -> Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/java-maven-hello.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ Build and test succeeded.'
        }
        failure {
            echo '❌ Build or tests failed.'
        }
    }
}

