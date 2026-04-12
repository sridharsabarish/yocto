# BSP and Kernel

## Choosing which Hardware to build

* `MACHINE` keyword set in local.conf or other confs.
    * Default for qemu it is set to `qemux86-64`. 
* `meta-yocto-bsp` layer has a set of machines for reference
* `MACHINEOVERRIDES` - allows custom setting based on the machine type

## Kernel modification
* Fragments are created to modify kernel behavior
* can be used to things like CAN BUS and other kernel specific functionality

* virtual kernel
    * abstraction that represents linux kernel

* menuconfig
    * `bitbake virtual/kernel -c menuconfig`

* Right arrow useful in navigation and letter `y` is used for selecting.

* diffconfig
    * Used to generate the diff of the kernel config
    * `bitbake virtual/kernel -c diffconfig`   

* savedefconfig
    * use to persist our changes to the kernel.
    * `bitbake virtual/kerenl -c savedefconfig`   