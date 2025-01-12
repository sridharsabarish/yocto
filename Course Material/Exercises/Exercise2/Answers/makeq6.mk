
# Task 1: 	
# Populate the extract target with @echo "source oe-init-build-env && devtool update ${RECIPE} ${WORKDIR}"

# Task2:
# Populate the clean-extract target with an @echo "Removing extracted source from ${WORKDIR}"
# @echo "source oe-init-build-env && devtool update ${RECIPE} ${WORKDIR}"

POKY_DIR = "~/work/poky/poky"
WORKDIR ?= "$(POKY_DIR)/build/workspace/sources/${RECIPE}"
RECIPE ?= "hello"
extract:
	@echo "Extracting ${RECIPE} to ${WORKDIR}"
	@echo "source oe-init-build-env && devtool update ${RECIPE} ${WORKDIR}"

clean-extract:
	@echo "Removing extracted source from ${WORKDIR}" 
	@ echo "rm -rf ${WORKDIR}"


