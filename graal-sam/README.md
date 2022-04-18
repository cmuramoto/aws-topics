# graal-sam

Example of deploying lambda function built with native image and proxied by API gateway.

To create the stack run:

```bash
sam build
sam deploy --guided
```

#H4 Caveats:

sam will zip the file contents in .aws-build directory before pushing to s3. 

This means that we must place the uncompressed function executable in the artifacts directory (see Makefile) to avoid duplicate zipping of the function.
