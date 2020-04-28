# jenkins-pipeline-library-demo
Demo of jenkins setup with pipeline library, jenkins job builder, and example app.

# Jenkins install instructions / resources

Run jenkins with docker container. See dockerfile?

Plugins?
* Workflow plugin  
* Cloud foundry

Install plugins with dockerfile? 

refs:
* https://hub.docker.com/r/jenkins/jenkins
* 

# Pipeline jenkinsfile
refs:
* https://www.jenkins.io/doc/book/pipeline/jenkinsfile/

# Configure pipeline library
Add config in jenkins.

refs: 
* https://www.jenkins.io/doc/book/pipeline/shared-libraries/

# Jenkinsfile in test application

Add bash script, one liner, for adding jenkinsfile, commit and push in a repo.

# Pipeline steps in docker containers
Remember to set labels on jenkins workers and master node. The lable is needed
in the pipeline.

refs:
* https://www.jenkins.io/doc/book/pipeline/docker/

# Create Jenkins job for test app
Basic pipeline examples in the pipeline library.

# Jenkins job builder
Install instructions

Job definitions.

refs:
* https://docs.openstack.org/infra/jenkins-job-builder/quick-start.html#use-case-1-test-a-job-definition
* https://docs.openstack.org/infra/jenkins-job-builder/definition.html#project
* https://docs.openstack.org/infra/jenkins-job-builder/project_workflow_multibranch.html

# Automate everything
Self updating with jenkins job builder? 
Workflow: commit new definition -> scm hook -> j job builder job auto trigger
-> all job definitions are updated in jenkins.

Automate plugin installations?

