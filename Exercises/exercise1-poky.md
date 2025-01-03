# Exercise 1 : Meet Poky

## Objective:
- Meet poky
- Run the Poky Build
- Get an idea of what we are dealing with.

## Meet Poky

- Poky, is the **reference distribution** of the Yocto Project which uses OpenEmbedded build system Technology. 

- It is a **toolset for building** embedded linux systems.


    - Its made up of
        1. Collection of tools 
        1. Configuration files
        1. Recipe Data a.k.a metadata
        
    
    - Its **key features** include 
    - flexible configuration,
    - support for cross compilation using bitbake-tool.
    - ability to generate minimal and optimized system images.


## Where to find it?
- In this Virtual Machine(VM), Poky is available at ~/work/poky. 
- Start by `cd ~/work/poky`.


## Part 1 : Getting Started
1. Find the script `oe-init-build-env`, can you identify what type of license it has?
1. What happens when you source this file? Note down the names of the images that start with core-image* on a piece of paper. We will use this later.
1. We are now inside the build directory, there are several conf files.
 Can you find which of these conf file is the largest by code length?
        <details>
        <summary>hint</summary>
    - You can use `find . -name "*.conf"` to find all the conf files inside a specific directory
    - Use `wc` to find word cound for a file
    - **Pro tip**: use `xargs` if possible to combine find and wc.
</details>

## Part 2: Exploration
1. Choose the one with the largest lines and try to read through the comments. The file is very often used and is very well documented.
 Can you identify what is the `DISTRO` it is using? 

1. Inside poky, there are several images, can you find out which directory has the rootfs images?
    <details>
    <summary>hint</summary>
    You can use find . -name "*.ext4" to find the file, from which you can infer the directory.
    </details>

## Part3: Build an image  (Skip)
- Could take a while recommended that one person jumps to part 4 and the other tries this to avoid any issues.


## Part 4: Running an Image

1. To make things simpler, we have the binaries pre-built. We now need a way to see if the image works as intended, we however don't have a real hardware to emulate.. What can we do instead?
    <details>
    <summary>hint</summary>

    - Consider using QEMU to Run the images.
    - You can use the command `runqemu nographic` to get started.

    </details>


## Part 5: Comparing with other images

1. Run core-image-minimal
1. Run core-image-full-cmd-line


## Compare the two QEMU instance
- Compare the /usr/bin
- What are the common files.



1. You have now successfully booted into the prebuilt image, can you find out how much memory and processor cores are present in the image?
    <details>
    <summary>hint</summary>

    - Use the command `free` to find the memory
    - Use the command `nproc` to find the processors

    </details>




## Advanced Challenges

1. Identify the ports used by QEMU and SSH into the VM.

    <details>
    <summary>hint</summary>
    
    Option 1:
    ` ps aux | grep qemu`

    Option 2: 
    `netstat -tuln | grep qemu`


    </details>


1. **Explore the Applications** available inside the build!
    <details>
    <summary>hint</summary>

    check the `usr/bin` and `/usr/sbin` folders
    
    </details>
1. There is a security vulnerability in this build, a user has by mistake saved his password in it, find it. 
#Todo: Create this file.
    
1. Transfer a file "Example.txt" from your computer to this QEMU instance.




### Duration : 15-20 mins

