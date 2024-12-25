#! /bin/bash

echo "Check if VM is usable.."
if ~/work/poky/poky/build &>/dev/null; then
    echo "VM is usable"
else
    echo "VM is not usable"
fi

