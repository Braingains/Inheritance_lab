# Introduction to Debugging in IDE

## Learning Objectives
- Know how to debug a Java application
- Understand breakpoints
- Understand the debugger console
- Know how to evaluate code fragments

## Task
As an introduction to debugging:
- watch the following video: [Intro to Debugging video](https://youtu.be/ErVZrVWZrko)


Answer the following questions:
1. What is the purpose of a breakpoint?

It allows the program to run as normal until reaching the breakpoint, at that point the program pauses and the debugging console is launched.

2. Does the line of code on a breakpoint run when you start debugging?

No, the program freezes at the instant before line with the breakpoint runs.

3. How do we debug the next line of code?

Click the "step into" button, which takes you to the what the next line of code (the one with the breakpoint) is doing.

4. What does the step into command do?

It takes you to what the next line of code is doing, for example, if the next line is a method that is called you'll be taken to the top of that method in your code.

5. What is the difference between evaluate expression and evaluate code fragment?

Evaluate expression allows you to run methods on the instances of objects in your program.
Evaluate code allows you to make new variables and run multiple methods on multiple lines of code, so it's more like a small self-contained version of your program.