# Even QEMU can be run with make.
SHELL := /bin/bash
# Settings
IMAGE?= "core-image-minimal" 



first:
	echo "This is the first target"
# Targets

# Task 1 : Create a target run-qemu-minimal which will just run QEMU with machine and image attributes
# Hint : runqemu $(IMAGE) nographic

run-qemu-minimal:
	@echo "I am going to run QEMU with bare minium"
	cd ~/git/poky && source oe-init-build-env &&
# Something is missing after the &&



# Task 2: Create a target run-qemu-full
# This target will run QEMU with a specified machine, image, set hte ram and expose a certain port


# QEMU Settings
MEMORY ?= 2048 # Change this to 1024


run-qemu-full:
	@echo "Running QEMU using make"
	cd ~/git/poky && source oe-init-build-env && \
	runqemu $(IMAGE) slirp \
	qemuparams="-m $(MEMORY)"
