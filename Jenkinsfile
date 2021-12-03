def gvy

//CODE_CHANGES = getGitChanges()
pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['0.1.0', '0.2.0', '0.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage('init') {
            steps {
                script{
                    gvy = load "myscript.groovy"
                }
            }
        }
        stage('Build') {
            // when {
            //     expression {
            //         BRABCH_NAME == 'dev' && CODE_CHANGES == true
            //     }
            // }
            steps {
                script {
                    gvy.buildApp()
                }
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gvy.testApp()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    gvy.deployApp()
                }
            }
        }
    }
    post {
        always {
            //It is same as finaly in Java
            echo 'Sending email whatever status of the build...'
            success {
                echo 'Deployed successfully the build...'
            }
            failure {
                echo ' Not deployed successfully the build...'
            }
        }
    }
}
