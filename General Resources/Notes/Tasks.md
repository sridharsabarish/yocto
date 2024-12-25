# Todo 
Fill more info for the individual tasks, explain a bit more.

# Tasks
- Tasks are units of execution for bitbake.
- Recipes use tasks to
    - Complete configuring
    - Compiling
    - Packaging Software

## Normal Recipe Build Tasks


`do_build`,`do_compile`,`do_configure`, `do_deploy`, `do_fetch`, `do_image`, `do_install`, `do_package`, `do_patch`, `do_unpack`.

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

`do_clean`, `do_cleansstate` and so on.

## Image Related Tasks

`do_bootimg`,  do_bundle_initramfs, do_rootfs,do_testimage

## Kernel Related Tasks



# Reference
https://docs.yoctoproject.org/ref-manual/tasks.html