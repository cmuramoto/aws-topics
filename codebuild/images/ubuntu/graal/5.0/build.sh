#!/bin/bash

docker build -f 00.core -t avalon.ecr.ubuntu/core:5.0 .
docker build -f 01.tools -t avalon.ecr.ubuntu/tools:5.0 .
docker build -f 02.docker -t avalon.ecr.ubuntu/docker:5.0 .
docker build -f 03.maven -t avalon.ecr.ubuntu/maven:5.0 .
docker build -f 04.graal-base -t avalon.ecr.ubuntu/graal/base:5.0 .
docker build -f 05.quarkus-base -t avalon.ecr.ubuntu/graal/quarkus:5.0 .
docker build -f 06.quarkus-extras -t avalon.ecr.ubuntu/graal/quarkus-extras:5.0 .
docker build -f 07.internal-libs -t avalon.ecr.ubuntu/graal/internal-libs:5.0 .
docker build -f 08.builder -t avalon.ecr.ubuntu/graal/builder:5.0 .
docker build -f 09.builder.codeartifact -t avalon.ecr.ubuntu/graal/builder-codeartifact:5.0 .
