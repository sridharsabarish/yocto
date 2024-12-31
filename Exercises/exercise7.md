# Exercise7: Devtool, Create a patch


`Devtool`  is part of the extended SDK, this can be used for working with patches.

## Part 0

1. What devtool command can you use to extract a recipe?
2. Once extracted, where can you find the source code of the recipe?
3. Which variable can you use to add a patch to a recipe?



## Part 1 - Extracting a recipe 


## Part 1 - Creating a new patch
- In Yocto, a patch is a file that makes changes to the source code, like fixing bugs or adding features.

- It is added to a recipe and applied during the build process.

- Patches help customize software for Yocto or solve specific problems. The patch file is usually stored in the recipe's files/ folder. Yocto automatically applies the patch before building the software.


In this example, we will create a patch using devtool on our existing recipe.

1. Devtool can help us unpack a recipe, can you find the command that is useful for extracting a recipe?

2. Find the source code `*.c`, here we can play around 
- Change the return value to 1
- and add a comment saying that "This is verified!"

3. Make a commit with this change.

4. Now generate a patch.


5. Add this patch to the files/ folder

6. Remember to include the patch to the SRC_URI

7. Build Your recipe using `bitbake`




## patching a patch?
* sometimes we might have to patch a patch, how can we create new patch?
* Simple, you extract the patch and add more info and commit


## Missing dependencies,
* Add a  run time dependcy to hello-2 recipe 




* Find a recipe
    * Which one ? I think something i made would be nice, no dependencies, simple.
* Go to the source
    * This would be nice.
* Add a comment to the recipe
* Generate a patch
* Compile the recipe using bitbake


## Multiple patches

- Add a patch to another file.
- Say waht the contents should be.
- What happens if you switch the order of the patch?


### Todo : Add more flavour and drama to the exercise

## Advanced Exercises (If time permits)