DEFAULT_GOAL: run

.PHONY: run test

run: 
	java src/application/Program.java

test:
	mvn test
