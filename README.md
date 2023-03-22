# AndroidPracticalAssessment
## DEMO 
https://user-images.githubusercontent.com/28810111/226972189-324fe990-96bf-4b45-a2a3-17b767c66d8e.mp4

## Going through this playlist by Phillip Lackner > https://www.youtube.com/playlist?list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC

## Installation
Please follow these steps to set up AndroidAssessment on your local machine.
1. Create a new, empty folder called androidassessmentamalitech/ within your home folder.
2. Navigate to it (cd androidassessmentamalitech), then clone the AndroidPracticalAssessment repo.
3. This will create a new folder named androidassessmentamalitech/AndroidPracticalAssessment.

- Note: Please keep the folder name as androidassessmentamalitech.
- Changing the project folder name might lead to future issues with running the pre-push checks on your machine.

2. Run the setup script, which adds some development tools for AndroidPracticalAssessment (ktlint, checkstyle, etc.):
-  For Windows
    - Install Git Bash Command Line
    - Open Git Bash Command Line.
    - Navigate to androidassessmentamalitech/AndroidPracticalAssessment.
    - Run the script ``` bash scripts/setup.sh ```.
    - Download the google_checks.xml(https://github.com/checkstyle/checkstyle/blob/14005e371803bd52dff429904b354dc3e72638c0/src/main/resources/google_checks.xml) file. To do this, you can simply right-click on the Raw button and click on Save Link as.
    - Copy this file to the directory where Git is installed (usually C:/Program Files/Git/).

3. Follow instruction on this https://stackoverflow.com/a/66133030/8277525 to change IntelliJ's import order for Kotlin to satisfy ktlint

4. In Android Studio, select File > Open, navigate to androidassessmentamalitech/AndroidPracticalAssessment, and click OK to load the project.

5. Click the elephant icon in the toolbar ("Sync Gradle") to ensure that all the correct dependencies are downloaded. (In general, you'll want to do this step any time you update your dependencies.)
