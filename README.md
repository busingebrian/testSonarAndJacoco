# SonarQube And Jacoco

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