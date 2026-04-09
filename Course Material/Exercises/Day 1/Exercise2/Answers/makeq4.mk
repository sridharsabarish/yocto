# Even QEMU can be run with make.
SHELL := /bin/bash

first:
	echo "This is the first target"
# Targets
# Task 1
run-qemu-minimal:
	@echo "I am going to run QEMU with bare minium"
	cd ~/git/poky/ && source oe-init-build-env && runqemu core-image-minimal nographic

# Task 2:

# Settings
IMAGE ?= "core-image-full-cmdline" # Set this to core-image-minimal
RAM ?=1024

run-qemu-full:
	@echo "Running QEMU using make"
	cd ~/git/poky && source oe-init-build-env && \
	runqemu $(IMAGE) slirp \
	qemuparams="-m $(RAM)"
