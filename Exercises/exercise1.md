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


## Exercises
1. If you explore the first two layers of poky's directory, there is a mysterious bash script.
Can you find it and identify what is at ln:#enterline?
    <details>
    <summary>hint</summary>
    You can use the -L option in ls, to specify how many layers you want to see.
    </details>


1. Once you have read this script, now Make use of this script and go to the build directory of poky. 
    <details>
    <summary>hint</summary>
    You can use find . -name "*.conf" to find all the conf files inside a specific directory
    </details>


1. Can you list the `*.conf` files inside this directory?


1. Inside poky, there are several images, can you find out which directory has the `*.ext4` image?
    <details>
    <summary>hint</summary>
    You can use find . -name "*.ext4" to find the file, from which you can infer the directory.
    </details>


1. To make things simpler, we have the binaries pre-built. We now need a way to see if the image works as intended, we however don't have a real hardware to emulate.. What can we do instead?
    <details>
    <summary>hint</summary>

    - Consider using QEMU to Run the images.
    - You can use the command `runqemu --nographic` to get started.

    </details>

1. You have now successfully booted into the prebuilt image, can you find out how much memory and processor cores are present in the image?
    <details>
    <summary>hint</summary>

    - Use the command `free -g` to find the memory
    - Use the command `nproc` to find the processors

    </details>




## Intermediate challenges # Todo
**What commands should we use?**

- Answer the question based on the build.

<details>
<summary>hint1</summary>
QEMU slide.
</details>

<details>
<summary>hint2</summary>
runqemu
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

