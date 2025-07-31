pipeline {
    agent any

    tools {
    maven 'maven_3.9.6'  // CORRECT name, matches Jenkins config
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

