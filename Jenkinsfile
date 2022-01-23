pipeline {
    environment {
        registry = 'adalbert13/twwo9-jenkins3'
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    agent any
    stages {
        stage('Clone Git') {
            steps {
                git branch: 'main', url: 'https://github.com/WojciechKania3/dummy'
            }
        }
        stage('Build image') {
            steps {
                script {
                    dockerImage = docker.build registry + ':tag'
                    echo 'Built image - $dockerImage'
                }
            }
        }
        stage('Push to DockerHub') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Clean up') {
            steps {
                sh 'docker rmi $registry:tag'
            }
        }
    }
}