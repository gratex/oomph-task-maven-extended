#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

docker run \
       -it \
       --rm \
       --name my-maven-project \
       --privileged=true \
       --userns=host \
       -v "$HOME/.m2:/root/.m2" \
       -v "$DIR:/project" \
       -w "/project" \
       maven:3.5.0-jdk-8 \
       /bin/bash -c "mvn -f com.gratex.oomph.task.maven.parent/pom.xml clean package && chown -R ""$(id -u):$(id -g)"" /project"

