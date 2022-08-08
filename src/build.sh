#!/bin/bash
javac -cp "./junit/junit-4.11.jar" *.java
java -cp "./junit/junit-4.11.jar;./junit/hamcrest-all-1.3.jar;." org.junit.runner.JUnitCore AppTest
java -cp "./junit/junit-4.11.jar;./junit/hamcrest-all-1.3.jar;." org.junit.runner.JUnitCore DeckTest
java -cp "./junit/junit-4.11.jar;./junit/hamcrest-all-1.3.jar;." org.junit.runner.JUnitCore CardTest
java -cp "./junit/junit-4.11.jar;./junit/hamcrest-all-1.3.jar;." org.junit.runner.JUnitCore PlayerTest
java App