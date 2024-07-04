# SonarQube And Jacoco

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

- ``./gradlew testDebugUnitTest``
- ``./gradlew testDebugUnitTestCoverage``
- ``./gradlew sonar -Dsonar.projectKey=PROJECT_KEY   
   -Dsonar.projectName='PROJECT_NAME'    
   -Dsonar.host.url=http://localhost:9000   
   -Dsonar.token={SONAR_TOKEN}``