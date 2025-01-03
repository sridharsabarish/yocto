# Exercise 2: Make

- Make is an **automation tool** that is often used to improve the build process.
- Makefiles exists to help decide which part of a large program needs to be recompiled.

## Learning Ourcome
- This exercise serves as a mild refresher to Make and sets the precendence for the upcoming exercises in Bibtake.

## General Syntax
Composed of set of rules and a rule looks like :

```Makefile
targets: prerequisites
command
command
command
```


## Objective:
- Fix the Makefile, so that we can build some linux kernel modules.

## Part 0: Getting Started
* Usually a Makefile is named as "Makefile" or "makefile", now we have a problem. Can you figure out how to run this file?

## Part 1 : Making a kernel module
* Make can also be used to build kernel modules in linux.
* In this example, we have a file `yocto_driver.c` and a makefile `Makefile`. Luckily the makefile is correct, so its all about calling the correct target. Can you find which prints the welcome message?

* There are two other targets, however the `yocto_driver.c` has some code commented out, maybe the comments have some clues?

## Part 2: Using Make for Yocto
* Read through Q3, Q4,Q5, Q6. The instructions ask you to do something, can you solve this mystery. Maybe at the end we will have a make file which we can use to test Poky?


# References
1. https://makefiletutorial.com/