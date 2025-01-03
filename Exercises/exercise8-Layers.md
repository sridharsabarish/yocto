# Exercise : Create a layer
* In this exercise we will explore and create new layers for our work.
* We will move the recipe we created in the previous exercise into this layer and try to build it ourselves.

## The tool
`bitbake-layers` is a powerful comand, it can do almost everything we want with layers.

## Part 0 : Getting Started
1. Identify what layers we have in the current poky build!
    - ` bitbake-layers show-layers`

1. There is a file which keeps track of these layers, do you which one it it is?

    <details>

    <summary>hint</summary>
    
    `bblayers.conf`

    </details>

1. Explore The `bitabake-layers` command and find which command helps us make a new layer.

<details>

<summary>hint</summary>
Its help documentation gives us an hint 

</details>

## Part 1 : Building a layer
1. Go a step out of build folder and try to create a new layer called `meta-experiment`


1. Now to try the bitbake-layers show-layers command

   - You will notice that this layer has not been added. This has to be added manually by bitbake-layers add-layers command.


### Requires review:
1. Create a simple recipe called `solna-yocto` and create a recipe called `solna.bb`

1. Use this c code to create a file 'hello.c'
    ```c
    //Simple Hello World Program 
    #include<stdio.h>
    int main() { 
    printf("Hello World , Created Bitbake recipe successfully\n"); 
    return 0;
    }

    ```

1. Modify the created recipe to include this file and compile the file so that we get the output

    # Todo : fix this code below.
    ```sh

    DESCRIPTION = "Hello world from solna"
    LICENSE = "MIT"
    LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=asd"

    SRC_URI = "file://solna.c"

    S = "${WORKDIR}"

    do_compile() {
            ${CC} solna.c ${LDFLAGS} -o solna
    }

    do_install() {
            install -d ${D}${bindisr}
            install -m 0755 solna ${D}${bindir}
    }

    ```

1. Select Machine configuration and hello to rootfs

IMAGE_INSTALL_append = " hello" #double check


<details>

<summary>hint</summary>

`bitbake-layers create-layer ../meta-experiments`

</details>

// more review needed.