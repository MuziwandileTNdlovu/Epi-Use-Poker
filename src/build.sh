#!/bin/bash
javac  -cp :junit-4.10.jar:test/junit/hamcrest-core-1.1.jar *.java
java -cp :junit-4.10.jar:test/junit/hamcrest-core-1.1.jar AppTest
java -cp :junit-4.10.jar:test/junit/hamcrest-core-1.1.jar DeckTest
java -cp :junit-4.10.jar:test/junit/hamcrest-core-1.1.jar CardTest
java -cp :junit-4.10.jar:test/junit/hamcrest-core-1.1.jar PlayerTest
java App
