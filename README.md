# Improper Use of Exceptions for Control Flow in Scala

This repository demonstrates a common Scala coding error involving the misuse of exceptions for control flow.  Exceptions should be reserved for exceptional circumstances, not for normal program logic.  This example highlights the issue and offers a better solution.

## The Problem

The `bug.scala` file contains a class `MyClass` with a method `myMethod`.  This method uses an exception (`Exception`) to handle the case where two integer values are not equal.  This is bad practice because exceptions are expensive and should not be used for routine comparisons. 

## The Solution

The `bugSolution.scala` file provides a corrected version of the code.  Instead of throwing an exception, the improved code returns a suitable default value or uses an `Option` to represent potential absence of a result, making it more robust and efficient.