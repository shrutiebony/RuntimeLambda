# Runtime Lambda project


It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.
The `cdk.json` file tells the CDK Toolkit how to execute your app.

## Pre-requisites
1) Java
2) Maven
3) AWS CLI - Installed and configured
4) CDK installed

## How to run the project
1) On line 31, inside the double quotes, give the absolute path of the aws jar, placed on local storage
2) In terminal or the command line, navigate to the project directory
3) Now run the following commands:
    1) cdk synth
    2) cdk bootstrap 
    3) cdk deploy 

## Few other useful commands
* `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!
