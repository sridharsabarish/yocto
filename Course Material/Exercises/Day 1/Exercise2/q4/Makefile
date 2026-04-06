# Even QEMU can be run with make.
SHELL := /bin/bash
# Settings
MACHINE ?= ""  # set this to qemux86-64
IMAGE ?= "" # Set this to core-image-minimal


# QEMU Settings
QEMU_RAM ?= 2048 # Change this to 1024
QEMU_SMP ?= 2    # Change this to 4
QEMU_VNC ?= 1    # Change this to 0


first:
	echo "This is the first target"
# Targets
# Task 1: Create a target run-qemu-full
# This target will run QEMU with machine, image, RAM, SMP and VNC attributes
# Hint : runqemu $(MACHINE) $(IMAGE) RAM=$(QEMU_RAM) SMP=$(QEMU_SMP) vnc=$(QEMU_VNC) nographic

run-qemu-full:
	@echo "I am going to run QEMU with specialization"
	cd ~/work/poky/poky && source oe-init-build-env && 
# Something is missing after the &&


# Task 2 : Create a target run-qemu-minimal which will just run QEMU with machine and image attributes
# Hint : runqemu $(MACHINE) $(IMAGE) nographic
run-qemu-minimal:
	@echo "I am going to run QEMU with bare minium"
	cd ~/work/poky/poky && source oe-init-build-env && 
# Something is missing after the && 