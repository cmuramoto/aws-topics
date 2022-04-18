build-EchoFunction:
	mvn clean package -Pnative 2>&1
	mvn failsafe:integration-test 1>&2
	unzip target/function.zip -d $(ARTIFACTS_DIR)
