pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
             sh 'git clone https://github.com/Abhiraj2310/java-maven-junit-helloworld.git'  
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
        stage('Deploy') {
            steps {
                sh 'docker build -t helloworld .'
                sh 'docker run -d -p 8081:8080 helloworld'
            }
        }
        stage('Upload Artifact') {
            steps {
                sh 'aws s3 cp target/helloworld.war s3://abhirajcicdjava/'
}
}
}
}
