# SonarQube And Jacoco
## Setting Docker compose

### Explanation of the configurations:
 - Version: Specifies the Docker Compose file format version.

 - Services: Defines the services that make up your application. In this case, it’s just SonarQube.

 - Image: Specifies the image to use for the service. Here, it’s using the Long Term Support (LTS) version of SonarQube.

 - Ports: Maps the container’s port 9000 to the host’s port 9000, allowing you to access SonarQube through http://localhost:9000.

 - Environment: Sets environment variables. The backslash in SONAR\_FORCEAUTHENTICATION should be removed to correctly define SONAR_FORCEAUTHENTICATION.

By following these steps, you should be able to successfully set up and run SonarQube using Docker Compose.
### Running the Configuration
 - Create a Directory: Create a directory for your Docker Compose file.

 - ``
mkdir sonarqube-docker
cd sonarqube-docker``
 - Save the Configuration: Save the above configuration into a file named docker-compose.yml within your created directory.

 - Start the Services: Use Docker Compose to start the services defined in the configuration.

  - ``docker-compose up -d``
 - The -d flag runs the services in the background.

 - Access SonarQube: Open your browser and go to http://localhost:9000 to access the SonarQube dashboard.

#### Stopping the Services
 - To stop the services, run:

 - ``docker-compose down``
This will stop and remove the containers, networks, and volumes defined in your configuration.


## Description of the jacoco.gradle file

- Jacoco Configuration: Sets the tool version to 0.8.11.
- After Evaluate Block: Configures Jacoco reporting for both Kotlin and Android projects, handling
  different build types and product flavors.
- Task Definition: The script dynamically creates a coverage task for each build variant. This
  avoids
  the UnknownTaskException by ensuring the task is created only when the corresponding test task
  exists.
- Task Naming: The script handles task naming dynamically based on the variant name, ensuring that
  the
  task names are correct and consistent.

## How to run
Run the following commands in order and for the proj key and proj name, replace them with your project key and name
- ``./gradlew testDebugUnitTest``
- ``./gradlew testDebugUnitTestCoverage``
- ``./gradlew sonar -Dsonar.projectKey=PROJECT_KEY   
   -Dsonar.projectName='PROJECT_NAME'    
   -Dsonar.host.url=http://localhost:9000   
   -Dsonar.token={SONAR_TOKEN}``