// vars/myLibrary.groovy

def call(String name) {
    echo "Hello, ${name}! This is a shared library."
}

def buildProject(String projectName) {
    echo "Building project: ${projectName}"
    // Add build logic here (e.g., shell commands)
    // sh 'gradle build' // Uncomment and modify as needed
}
