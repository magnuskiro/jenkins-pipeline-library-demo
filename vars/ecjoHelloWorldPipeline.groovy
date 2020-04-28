

def call(inputVar) { 
    pipeline{
        agent any
        stages {
            stage('Prepare') {
                steps {
                    echo "Hello world!" + inputVar
                    script
                    sh "chmod +x ${env.WORKSPACE}/eik-platform-demo-java11-service/*.sh"
                }
            }
        }        
    }
}

