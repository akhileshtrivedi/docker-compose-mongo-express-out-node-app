def buildApp() {
    echo 'Building the application...'
}
def testApp() {
    echo 'Testing the application...'
}
def deployApp() {
    echo 'Deploying the application...'
    echo "Deploying with ${params.VERSION}"
}

return this
