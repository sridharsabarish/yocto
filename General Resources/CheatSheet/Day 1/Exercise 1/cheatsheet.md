
# Cheat Sheet

## Poky

### Setup Dev Env

* `source oe-init-env.sh`

### local.conf
* Overrides everything.
* No version control, bad practice to use.

### Compile a Recipe/Image

* `bitbake core-image-minimal` - The base image with minimal features
* `bitbake core-image-full-cmdline` - Complete CLI Linux image

### Starting QEMU

* `runqemu` `imagename`


## Linux commands

* `wc` - useful to find wordcount
* `nproc` - processor



