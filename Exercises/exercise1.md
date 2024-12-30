# Exercise 1 : Meet Poky

Poky, is the reference build system from Bitbake.
Poky is used to verify Yocto Project and is also a good place to start with exploration.


In this Virtual Machine, Poky is cloned at ~/work/poky. 
Start by `cd ~/work/poky`.


Q1. What do you see in the first two layers of the directory?
<details>
<summary>hint</summary>
You can use the -L option in ls, to specify how many layers you want to see.
</details>


Q2. Go to the build directory of poky and list the conf files inside it!
<details>
<summary>hint</summary>
You can use find . -name "*.conf" to find all the conf files inside a specific directory
</details>

Q3. Inside poky, there are numerous images, can you find out which directory has the `*.ext4` image?
<details>
<summary>hint</summary>
You can use find . -name "*.ext4" to find the file, from which you can infer the directory.
</details>


Q4. Now we have the binaries built, we need a way to see if the image works as intended, we however don't have a real hardware to emulate.. What can we do instead?
<details>
 <summary>hint</summary>

- Consider using QEMU to Run the images.
- You can use the command `runqemu` to get started.

</details>

Q5. You have now successfully booted into your first image, can you find out how much memory and processor cores are present in the image?
<details>
<summary>hint</summary>

- Use the command `free -g` to find the memory
- Use the command `nproc` to find the processors

</details>


## Objective:
- Run the Poky Build using QEMU

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


### Challenges

1. Identify the ports used by QEMU and SSH into the VM
1. **Explore the Applications** available inside the build.
1. There is a password hidden, find it.

Todo 
* Maybe something about scping a file? 
* Or something about printing the number of processors in it? 





### Duration : 10-15 mins

