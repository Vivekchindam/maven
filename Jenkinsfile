pipeline {
    agent any
    tools {
        maven 'maven 3.9.6' // Configure Maven in Jenkins Global Tools
        jdk 'JDK11'         // Configure JDK in Jenkins Global Tools
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Vivekchindam/maven.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Run') {
            steps {
                sh 'java -cp target/java-maven-hello-1.0-SNAPSHOT.jar com.example.HelloWorld'
            }
        }
    }
}

