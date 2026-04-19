# The Project

## Introduction
* In this final exercise, we will build a custom linux distribution for a Raspberry PI 4B.

### The objective
* Inculcate best practices for Developing with Yocto!
* Build a custom Linux Distribution for RPI

### Hardware Info
* RPI 4B 
    * RAM - 4GB
    * Memory - 64GB (Micro SD)
* Extra HW
    * USB microsd converter for burning Images
    * MicroHDMI to HDMI
        * For connecting to RPI
    * Keyboard (Needed)    
    
    * **Good info**
    *   `ROOTFS : wic`
    *   `Balena Etcher` : **Run as Admin!**


### Extra Tip
* Use LLMs to debug!


## Requirements for the project 

1. Makefile
    * Build Yocto
    * variable that will determine if we build for raspberry or qemu
    * devtool extract your image! 
2. Your own Image
    * You can take inspiration from `core-image-minimal`  and build your own custom image

3. Your own Distro
    * Should be different than Poky

4. Your own recipe which installs a file, .c , .txt or .sh into your image under /opt/myproject/


## Exercises (To get started)
### 0. Make
* Create a make file that should be able to run your image and build for either qemu or for raspberypi4


### 1. Baseline - RaspberryPI Image
* Change Machine to "raspberrypi4" in local.conf and try to build "core-image-minimal"



### 2. Adding your files to Yocto
* Create a file and name it as project.txt
* Create a shell script called project.sh
* Add these files in your recipe
* Copy the files and install them in /opt/ directory
* Check if your files are present in the file system!





### 3. Invade the space (Very Easy)

#### Source
https://github.com/doctorfree/ninvaders

#### Tasks

1. Create a recipe for this application! 
    - Is there a flag to specify a different branch?

2. What do you think happens when you inherit cmake?

3. Build the image, burn it to MicroSD and then try with RPI!

### 4. Glitch in the Matrix (Easy)

#### Source
*  Go to  https://github.com/abishekvashok/cmatrix. 

#### Tasks
1. Your task is to create a recipe for this application 
2. Find out how to integrate this into your linux image.
3. Burn the generated image to RPI and try running the command `cmatrix`

#### Questions to think about!
* What tool can we use to create a recipe?
* Where can we find licensing information?
* What does chatGPT say when you post the error message?



## Open Ended
* Try to find some ncurses based utilities from github and install them on your RPI Image.
* Try to find a terminal based game and add it your RPI Image.