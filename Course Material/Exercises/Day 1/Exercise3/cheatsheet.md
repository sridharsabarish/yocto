
# Cheat Sheet

## Bitbake Syntax

1. Append/prepend with spaces (`+=`)
1. Append/prepend without spaces (`.=`)
1. Immediate Expansion (`=:`)
1. Weak assignment (`?=`)
1. Override Syntax (`:append`, `:prepend`) - Guaranteed operations
1. `IMAGE_ROOTFS_TYPES = "ext4 tar.gz"`
1. Removal? `:remove`
    - Always done after append and prepend operations


# Tip 

## Bitbake environment flag 

* You can put the code or question (from the exercise) in a .bb file and then use bitbake -e to verify your outputs.

To test the output you can use the following command below.


```shell

bitbake your recipe -e | grep ^VARIABLE=

```

Eg : `bitbake your-recipe -e | grep ^A=|`


