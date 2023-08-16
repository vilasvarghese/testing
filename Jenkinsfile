pipeline {
    agent any
    
    environment {
        GIT_REPO_URL = 'https://github.com/vilasvarghese/testing.git'
        //GIT_CREDENTIALS_ID = 'your-git-credentials-id'
        //CHECKOUT_PATH = '/path/to/checkout'
        MAVEN_TOOL = 'M3'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/master']], 
                          userRemoteConfigs: [[url: env.GIT_REPO_URL]]])
                          //, credentialsId: env.GIT_CREDENTIALS_ID
            }
        }
        
        /*stage('Build with Maven') {
            steps {
                script {
                    def mvnHome = tool name: env.MAVEN_TOOL, type: 'hudson.tasks.Maven$MavenInstallation'
                    
                    /*dir(env.CHECKOUT_PATH) {
                        sh "${mvnHome} clean install"
                    }* /
                    sh "${mvnHome} clean install"
                    
                }
            }
        }*/
    }
}


