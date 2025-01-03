# Exercise: Explore Metadata and Recipes


## Objective
- Explore metadata and intro to recipes
- Understand what components make up a recipe.


## Introduction

* Yocto uses several metadata, of which the first and most important one is a recipe.
* A recipe defines several tasks which could include how to
    - fetch,
    - configure,
    - build
    - install software packages in an embedded linux system.

//Recheck
* It consists of metadata, instructions, and dependencies, typically following a bitbake syntax.

## Why?
* Recipes ensures 
-   consistency and automation in build process,
-   enabling creation of customized software layer.



## How it looks.
A Recipe usually has an extension `.bb` and the appends for the recipes follow the `.bbappend` extensions.






## Exercises
1. Can you identify how many recipes are present in the directory `~/work/poky/poky/meta-poky`

    <details>
    <summary>Hint</summary>
    Can we use `find " and check for the files with the extension that matches a recipe?
    </details>


1. There is a mystery recipe `xyz.bb` that has been created and this recipe is somehwere on the outer directory, can you find this recipe and do a `cat` on this recipe. 

1. This recipe performs certain tasks, can you find the task which uses a bitbake log called bbfatal?

1. Since the situation is not Fatal, change the warning type of this task to bberror and updated the error message to `Not so fatal anymore`.

1. One of the other task is trying to `create a folder` can you identify which command it is?

    <details>
    <summary>hint</summary>
    What commands can you use to create a folder?
    </details>
1. There are a lot of Jargons, D, S, SYS_CONF_DIR, and what not? How do we find what it means? Read the info on #Todo : give the directory.

1. Use the same command in `do_install` task to create a dummy text file `dummy.txt' in the `SYS_CONF_DIR` directory.

1. There are certain mysterious symbols, D, S, SYS_CONF, and so on which yocto uses in its dictionary, can you print the variables and see where they point to?

1. Which command is used to read from a class?
1. How do we make use of inc?
1. What is the difference between an inc and a class file?



1. This recipe has a `.bbappend` file, can you try to add a BB_ERROR() to the do_configure task. Note: you will need to use do_configure_append() to do that.

