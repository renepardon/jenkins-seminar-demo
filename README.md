# jenkins-seminar-demo

First we need to install a Jenkins instance with all required Plugins to checkout and build our application.

    cd jenkins/ && \
    docker-compose up -d && \
    docker-compose ps

Then we need to retrieve our admin password to be able to login to Jenkins:

    cat /tmp/jenkins-task-6/secrets/initialAdminPassword

Now create a project with the following URI defined: 