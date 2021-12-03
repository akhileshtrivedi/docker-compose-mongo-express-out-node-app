def buildApp() {
    echo 'Building the application through groovy...'
}
def testApp() {
    echo 'Testing the application through groovy...'
}
def deployApp() {
    echo 'Deploying the application through groovy...'
    echo "Deploying with ${params.VERSION} through groovy"
}

return this
