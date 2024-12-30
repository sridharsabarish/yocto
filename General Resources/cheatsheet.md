
# Cheat Sheet


## Poky

### Setup Dev Env

* `source oe-init-env.sh`

### Compile a Recipe/Image

* `bitbake core-image-minimal` : The base image with minimal features

### Emulate the Built Image

* `runqemu`

## QEMU

* `runqemu`

## Track Variable

* `bitbake -e ^VARIABLE`

## Dependency Graph Thingy?

* `bitbake -g <Recipe>`


## Extensible SDK

### Devtool

* `devtool modify recipe`

* `devtool update recipe`

* `devtool reset recipe`


### Patch Creation

* `git format-patch~1`

### Recipetool

* `recipe tool create`


# Conf

## Local.conf

* `MACHINE` - This variable is set to architecture qemux86-64,etc.
* No Version control, so don't use unnecessarily

## BBLAYERS.conf

* Layers should be added here.

## Layer.conf

* Layer specific
* 


# Bitbake Syntax

1. Append/prepend with spaces (`+=`)
1. Append/prepend without spaces (`.=`)
1. Immediate Expansion (`=:`)
1. Weak assignment (`?=`)
1. Override Syntax (`:append`, `:prepend`) - Guaranteed operations
1. `IMAGE_ROOTFS_TYPES = "ext4 tar.gz"`
1. Removal? `:remove`
    - Always done after append and prepend operations


# Useful Locations

* Images
    - /build/tmp/
* License
    - /
* Source code?
    - /work/sources


# Steps to make a patch

1. `devtool modify <recipe_name>`
2. Make changes
3. `git format-patch~1`
4. Copy the patch to the location
5. Ensure `SRC_URI += "File://*.patch"`
6. Run with patch
# To rework and updated more.


# Yocto Troubleshooting

## Debug packages

* Steps to enabled debug-pkgs #tbd

## Bitbake Environment

## Logs in Yocto

## Adding traces
   bb_warn, bb_error, bb_note


