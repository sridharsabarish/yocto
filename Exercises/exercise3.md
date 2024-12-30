# Exercise: Explore a recipe

* A recipe defines how to fetch, configure, build and install software packages in an embedded linux system.
* It consists of metadata, instructions, and dependencies, typically following a bitbake syntax.
* Recipes ensures consistency and automation in build process, enabling creation of customized software layer.




A Recipe usually has an extension `.bb` and the appends for the recipes follow the `.bbappend` extensions.

Q1. Can you identify how many recipes are present in the directory `~/work/poky/poky/meta-poky`

- todo : give hint

Q2. There is a recipe `xyz.bb` that has been created and this recipe is somehwere on the outer directory, find this recipe and do a `cat` on this recipe.

Q3. This recipe performs certain task, can you find the task which uses BB_FATAL?

Q4. Change the warning type of this recipe to BB_ERROR and updated the error message to `Not so fatal anymore`.

Q5. One of the task is trying to create a folder can you identify which command it is?

Q6. Use the same command in do_install to create a dummy text file `dummy.txt' in the sys_conf directory.

Q7. There are certain mysterious symbols, D, S, SYS_CONF, and so on which yocto uses in its dictionary, can you print the variables and see where they point to?

Q8. This recipe has a `.bbappend` file, can you try to add a BB_ERROR() to the do_configure task. Note: you will need to use do_configure_append() to do that.



## Objective


* 
### Write a recipe from scratch.
* This recipe should output a message during the build process.
    * You can use BB_WARN, BB_ERROR or BB_DEBUG
    * Recipe can be of any name.
    * The error message should be given during the INSTALL phase of the recipe.
* Make the recipe create a file and copy this file to $HOME
* Create a folder too.
* Refer to the slides for more info!!


# Some theory about writing loggin in Python


# some theory about writing logs in Bash



# Some markers to see how they are doing would be nice! #Todo


* TBD: More Research needed.


