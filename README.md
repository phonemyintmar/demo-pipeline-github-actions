# Custom Pipeline with Github Actions

## Introduction

This repository demonstrates a sample CI/CID pipeline with different features using Github Actions.

## Features
- **Continuous Integration**: Automated testing and building artifacts on each push or pull requests and necessary events.  
- **Continuous Deployment**: Automatic deployment to different environment (development, staging, production) on successful builds.  
**Code Quality**: Integration with code quality tools like SonarQube and security tools like snyk and dependabot.  
**Monitoring and Alert**: Ability to send alert and emails on each fail or successful builds and deployments.  
**Interactive debugging**: Being able to test the pipeline and debug it interactively without needing to run the pipeline again and again to test new features.  
**Scheduling jobs**: Schedule necessary jobs to be able to ran periodically via pipeline.  
**Other features**: Environment specific pipelines, release management and pipeline optimizations to ensure smooth and fast execution of the jobs.  

## Branching Strategy
We will be utilizing Git Flow as the branching strategy in this repository. There will be three environments: development, staging, and production.
