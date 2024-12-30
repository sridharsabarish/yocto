#! /bin/bash

echo "Check if VM is usable.."
if ~/work/poky/poky/build &>/dev/null; then
    echo "VM is usable"
else
    echo "VM is not usable"
fi

# make this a bit more diverse.
# Basically we need to check if it is possible to run some commands like 
# bitbake-layers show-layers

# maybe some sanity check on the files provided. If some file is missing it should say which is 


