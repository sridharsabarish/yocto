# Even QEMU can be run with make.
SHELL := /bin/bash
# Settings
MACHINE ?= "qemux86-64"  # set this to qemux86-64
IMAGE ?= "core-image-minimal" # Set this to core-image-minimal


# QEMU Settings
QEMU_RAM ?= 2048 # Change this to 1024
QEMU_SMP ?= 2    # Change this to 4
QEMU_VNC ?= 1    # Change this to 0


first:
	echo "This is the first target"
# Targets
# Task 1:

run-qemu-full:
	@echo "I am going to run QEMU with specialization"
	cd ~/work/poky/poky/ && source oe-init-build-env && runqemu $(MACHINE) $(IMAGE) RAM=$(QEMU_RAM) SMP=$(QEMU_SMP) vnc=$(QEMU_VNC) nographic
# Task 2
run-qemu-minimal:
	@echo "I am going to run QEMU with bare minium"
	cd ~/work/poky/poky/ && source oe-init-build-env && runqemu $(IMAGE) nographic