# A simple make file to run qemu. We can specify qemu settign here and make it run for us.
# Review needed.
# Settings
DISTRO ?= "" #Set this to poky
MACHINE ?= ""  # set this to qemux86
IMAGE ?= "" # Set this to core-image-minimal
TOOLCHAIN ?= "core-image-minimal" 

# QEMU Settings
QEMU_RAM ?= 2048 # Change this to 1024
QEMU_SMP ?= 2    # Change this to 4
QEMU_VNC ?= 1    # Change this to 0


COMMAND_FOR_QEMU = "cd ~/work/poky/poky && source oe-init-build-env && runqemu $(MACHINE) $(IMAGE) nographic"
COMMAND_FOR_QEMU_CUSTOM = "cd ~/work/poky/poky && source oe-init-build-env && runqemu $(MACHINE) $(IMAGE) RAM=$(QEMU_RAM) SMP=$(QEMU_SMP) vnc=$(QEMU_VNC) nographic"
first:
	echo "Dummy"
# Targets
run-qemu-full:
	@echo "I am going to run QEMU with specialization"
	@echo ${COMMAND_FOR_QEMU_CUSTOM}

run-qemu-minimal:
	@echo "I am going to run QEMU with bare minium"
	@echo ${COMMAND_FOR_QEMU}



