#!/bin/bash


JUNIT_DIR="$HOME/development/codes/for_courses/software_testing/junit"
EXERCISE_DIR="$HOME/development/codes/for_courses/software_testing/assignment1/TennisGame"

javac -cp $JUNIT_DIR/junit-4.12.jar $EXERCISE_DIR/tests/TennisGameTest.java $EXERCISE_DIR/src/*.java
