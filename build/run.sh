#!/bin/bash

JUNIT_DIR="$HOME/development/codes/for_courses/software_testing/junit"
EXERCISE_DIR="$HOME/development/codes/for_courses/software_testing/assignment1/TennisGame"

java -cp $JUNIT_DIR/junit-4.12.jar:$JUNIT_DIR/hamcrest-core-1.3.jar:$EXERCISE_DIR/src/:$EXERCISE_DIR/tests/ org.junit.runner.JUnitCore TennisGameTest
