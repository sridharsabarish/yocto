# IMAGES

# What is an image?
* A Yocto image is a **custom Linux system** built for embedded devices, created using the Yocto Project.
* It combines the **Linux kernel, essential software, and settings** into one ready-to-use package. 
* You can tailor the image to include only the software and features you need, making it lightweight and efficient for specific hardware. 
* The Yocto build system makes it easy to select what goes into the image, ensuring it’s optimized for performance. 
* Once built, the image can be installed on devices, offering a stable and flexible solution for embedded projects.

# Rework
* Maybe some story about different image types, some drama, then make the student choose the correct image type
* Build an image of the format UBI and tar.gz
* Run this check against a `tester code!`


## Part 0 : Getting Started

If you recollect, when we worked with `source oe-init-build-env`, the text displayed certain images that we could "bake" which looked like "core-image-*".

1. An image looks like a recip,  Which one of these images do you not see when you source oe-init-build-env?

    1. core-image-weston
    2. core-image-full-cmdline
    3. core-image-x12
    4. core-image-sato

1. Under which folder can you find the `core-image-full-cmdline` and `core-image-minimal`?

    Hint

    - `find . -name "core-image-full-cmdline.bb"`

1. Find this image and see if ssh-server is available in this?



## Part 1

### Todo : Add more flavour and drama to the exercise

1. IMAGE has several attributes that we can use to shape our image, can you find the attribute that is used to change the filesystem type?

    <details>
        <summary>hint</summary>
        IMAGE_FS_TYPE
    </details>

// Researrch what command is needed. FIll in hint and test.
1. Can you use this variable to change the filesystem to .ubi and .tar.gz

1. We have a requirement to change the size of the filesystem to 2GB maximum, this can be done with another variable, can you set that?


## Part 2

Currently, the package "vim" is being set in the local.conf, this is okay for temporary use, however since local.conf is not version controlled, there is a risk that this might get lost in the subsequent revision.

Maybe there is a better way out? 

Go here : https://docs.yoctoproject.org/dev/dev-manual/customizing-images.html

and understand what other ways we can use to customize an image.  (Focus especially on the last part)


Q1. Now use that method to make the change.


// More refinement needed.
## Part 3  : Run on QEMU
* Something about settings for QEMU.
* Make them go through qemu help and set certain attributes.
* Try to run this image in 

with 1024 Mb of ram
`runqemu qemuarm64 -m 1024`

```sh
runqemu qemux86-64             # Run the qemux86-64 image (default)
runqemu qemux86-64 RAM=2048    # Run with 2048 MB of RAM
runqemu qemux86-64 nographic   # Run with serial console, no graphical interface
runqemu qemux86-64 kernel=/path/to/kernel  # Use a custom kernel for boot
runqemu qemux86-64 sshd=1      # Enable SSH in the virtual machine
runqemu qemux86-64 SMP=4       # Allocate 4 CPU cores for the VM
runqemu qemux86-64 disk-image.ext4  # Use the specified disk image
runqemu qemux86-64 vnc=1       # Enable VNC on display :1 for remote access
runqemu qemux86-64 boot=d      # Boot from the disk
runqemu qemux86-64 ip=dhcp     # Set networking to use DHCP for IP address
runqemu qemux86-64 nographic bootargs="console=ttyS0 root=/dev/sda1"  # Custom boot arguments with serial console
```