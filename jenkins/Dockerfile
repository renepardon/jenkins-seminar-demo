FROM jenkins/jenkins:lts

ENV TERM xterm

USER root

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
RUN echo 2.0 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state

RUN apt-get update
RUN apt-get -y install apt-transport-https \
    ca-certificates \
    curl \
    gnupg2 \
    software-properties-common \
    zip

RUN curl -fsSL get.docker.com | sh
RUN usermod -aG docker jenkins

COPY ./jenkins_docker.sh /usr/local/bin/jenkins_docker.sh
RUN chmod 0755 /usr/local/bin/jenkins_docker.sh

CMD DOCKER_GID=$(stat -c '%g' /var/run/docker.sock) && \
    groupadd -for -g ${DOCKER_GID} docker && \
    usermod -aG docker jenkins && \
    usermod -aG staff jenkins

# Fix for Seminar - commented :)
# USER jenkins

EXPOSE 8080
EXPOSE 50000

ENTRYPOINT ["/sbin/tini", "--", "/usr/local/bin/jenkins_docker.sh"]