.PHONY: verify test

test:
	./gradlew test

verify: test
