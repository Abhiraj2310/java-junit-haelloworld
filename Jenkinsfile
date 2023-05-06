pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
             sh 'git clone https://github.com/Abhiraj2310/java-junit-haelloworld.git'  
            }      
        }
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
         stage('Integration  Test') {
        steps {
                sh 'mvn verify'
            }
        }
        
        stage('Upload Artifact') {
            steps {
                sh 'aws s3 cp target/* s3://abhirajcicdjava/'
}
}
}
}
