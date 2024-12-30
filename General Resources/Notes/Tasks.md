# Todo 
Fill more info for the individual tasks, explain a bit more.

# Tasks
- Tasks are units of execution for bitbake.
- Recipes use tasks to
    - Complete configuring
    - Compiling
    - Packaging Software

## Normal Recipe Build Tasks

| Task Name | Task Name | Task Name |
|-----------|-----------|-----------|
| do_build  | do_compile| do_configure|
| do_deploy | do_fetch  | do_fetch_all|
| do_image  | do_install|           |

## Explanation for each task

`do_build`: Builds the software by calling make. This task makes sure dependencies are satisfied and does the actual build of the software.

`do_compile`: Used to compile the source code. This task is often used to patch the source code and to compile the source code.

`do_configure`: Used to configure the software prior to compilation. The configuration is done by running ./configure or similar command.

`do_deploy`: Used to deploy the built software to the target hardware. This task copies the built software to the target hardware.

`do_fetch`: Used to fetch the source code of the software. This task downloads the source code from the given URL or from a local directory.

`do_fetch_all`: Used to fetch all the source code that is needed for the build. This task downloads all the source code from the given URLs or from local directories.

`do_image`: Used to create the image of the target hardware. This task creates the image of the target hardware by combining the built software from the recipe with the base image.

`do_install`: Used to install the built software to the target hardware. This task installs the built software to the target hardware by copying the built software to the target hardware.


<!-- ### do_build

### do_compile

### do_configure

### do_deploy

### do_fetch


### do_image


### do_install


### do_package


### do_patch


### do_populate_*


### do_rm_work

### do_unpack
 -->

## Manually Called Tasks

| Task Name | Task Name | Task Name |
| --- | --- | --- |
| do_cleanall | do_clean | do_cleansstate |
| do_devshell | do_menuconfig | do_package_write_rpm |
| do_populate_sdk | do_rm_work | do_shared_workdir |

* `do_cleanall`: This task cleans all the build artifacts of all the recipes in the current build directory.
* `do_clean`: This task cleans the build artifacts of the current recipe.
* `do_cleansstate`: This task cleans the build artifacts of the current recipe and all its dependencies.
* `do_devshell`: This task opens a new shell with the build environment variables set.
* `do_menuconfig`: This task runs the menu configuration tool of the recipe.
* `do_package_write_rpm`: This task generates the RPM package of the recipe.
* `do_populate_sdk`: This task creates the SDK of the recipe.
* `do_rm_work`: This task removes the build artifacts of the current recipe.
* `do_shared_workdir`: This task creates the shared work directory of the recipe.

## Image Related Tasks

| Task Name      | Task Name               | Task Name        |
| ---            | ---                     | ---              |
| `do_bootimg`   | `do_bundle_initramfs`   | `do_rootfs`      |
|                |                         | `do_testimage`   |

## Kernel Related Tasks



# Reference
https://docs.yoctoproject.org/ref-manual/tasks.html
