# Make File

## Default target
* First target is the default target


## Running any make file

`make -f <filename> <target>`

## Yocto Use Cases
* Use Make to streamling yocto's processes (Not verifed, tune to your liking)

```make

RECIPE ?=hello

build-target:
            cd ~/git/poky && source oe-init-build-env
            bitbake <recipe-name>

run-qemu: build-target
          runqemu <image-name>

clean-build: cd ~/git/poky && source oe-init-build-end
             bitbake -c clean <recipe-name>

extract-source:
        cd ~/git/poky && source oe-init-build-env
        devtool modify $RECIPE

start-devshell:
        cd ~/git/poky && source oe-init-build-env
        bitbake -c devshell $RECIPE
            
```
