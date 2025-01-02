# Exercise 2: Make

- Make is an **automation tool**, that is often used to improve the build process.
- Makefiles exists to help decide which part of a large program needs to be recompiled.


- This exercise serves as a mild refresher to Make and sets the precendence for the upcoming exercises in Bibtake.



## Why are we learning Make? 
// Todo : A bit more word refinements would be nice.
- Make has a lot of similarities to Yocto’s BitBake tool. 
- This tools processes recipes and layers to build software packages. 
    - It helps with
        - managing dependencies,
        - compiling code,
        - and execute tasks like installation and packaging.

-  Make's efficiency in handling complex workflows complements Yocto’s modular and flexible approach to embedded systems. 
- Together, they streamline the build process for customized Linux distributions targeting embedded devices.


## General Syntax
Composed of set of rules and a rule looks like :

```Makefile
targets: prerequisites
command
command
command
```


### Some complex examples
```Makefile
all: one two three

one:
	touch one
two:
	touch two
three:
	touch three

clean:
	rm -f one two three
```


# Todo : Add some more indepth information on Make.

## Objective:
- Fix the Makefile, so that we can build some linux kernel modules.

## Principles Covered
-  Syntax

### Files
* `yocto_driver.c` and `build.sh` 


## Exercise
1. Open the Makefile? Do you notice something in the Name of the file, its not called "Makefile", so how can you run this file? #Todo : make the make file even richer.
2. The words with : next them like "hello:","clean:", "all:" are called targets, this is what we invoke when we use a make file?  Can you create a new target called "compile_driver:" that prints("This is a message from driver target")
3. Usually makefiles are used to run scripts, deal with drivers and a lot more. Can you run the `build.sh` in the script created? This would print some interesting information on the screen.
4. The next part which if you have done the previous one, is to build the kernel code in c. This would require usage of a special code. Luckily there is an example code avaialble at yocto_driver.c. use this code as reference and fill in the Mystery.c file.
5. Now try to compile the mystery.c file using the make commands.

6. Now you should get the clue to whats coming in the next exercise.

7. Variables based exercise
 one = one ${later_variable}
 two := two ${later_variable}


8. Conditional assignment stuff.

## Duration : 10-15 mins.

<details>
<summary>hint1</summary>
Check the folder for make and see what targets it has.
</details>

<details>
<summary>hint2</summary>
Errors give a good understanding. Take a look into the error and Fix it.
</details>



# References
1. https://makefiletutorial.com/