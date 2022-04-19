#!/bin/bash

./codebuild_build.sh -i avalon.ecr.ubuntu/graal/builder-codeartifact:5.0  -a codebuild_result -c $HOME/.aws
