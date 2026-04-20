## 1. Brining back the good old days!

- If you have ever used a nokia phone, you would have definitely played this game!
- So lets add a small game to our linux distro to bring back nostalgia to the good old days!

### Source
* Go to github.com/alexdantas/nSnake.git

### Task

* Create a recipe for this game!

* Try building the recipe!
    * Does it build?
        * Find a way to build it!

* Clue:
    * Add the dependency to a library!
    * `FILE:${PN}` $also needs to be added to avoid packaging error!
    * Maybe something about `EXTRA_OEMAKE`?
       
## 2. Meet  the game that sounds japanese but is actually American

### Source

* Go to `github.com/jubalh/nudoku.git`


### Task

* Create a recipe for this game!

* Try building the recipe!
    * Does it build?
        * Resolve dependencies and build it!

* Play a game to see if it works as intended!


## 3. Cowsay

### Source
*  Go to `https://github.com/cowsay-org/cowsay.git`

### Task

* Create a recipe for this weird app!

* Try building the recipe!
    * Fix the Licenses! 
    * Note you may have to add support for FILES to avoid packaging error!
    * Pay special attention to do_install make you don't need to specify extra arguments! 

* Verify it is installed by running
* `cowsay moo` in your terminal! 


## 4. SL (no not your public transportation app)

### Source 
* Go to `https://github.com/mtoyoda/sl`

### Task
* Create a recipe for this app!
* Try building the recipe!
    * Potential Issues
        * License needs to be changed? What do we do when there is none?
        * Do we have all the dependencies met?
        * does do_compile work?
            * Maybe ask chatgpt what to do to fix? 
        * Are we installing anything?
            * Maybe we should install the built binary somewhere!!!!!!
* **Tip:** Ask for solution, if you are stuck for more than 20mins!   

* Once built, try to run it in raspberry pi and see the output!!!

## 4. Comparison is the thief of Joy.

* Another easy way to include something into your image is to compare whats been already built by `core-image-full-cmdline`
* This would ensure that we woudn't have to wait long time to rebuild!

### Task
* Explore QEMU with `core-image-full-cmdline` image
    * Make a note of applications in `ls /usr/bin`
        * Try to find atleast 5 different application that are not present in your image.
* Add support for these newly found application in your image!
* Build your image
* Flash the image to rpi and test!

