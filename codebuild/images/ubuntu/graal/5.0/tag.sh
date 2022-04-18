#!/bin/bash

REPO_ID=$1

if [[ -z $REPO_ID ]]; then
  echo "Usage tag.sh <repo_id>"
  exit 1
fi

docker tag avalon.ecr.ubuntu/graal/builder-codeartifact:5.0 public.ecr.aws/$REPO_ID/graal/builder:codeartifact-latest
