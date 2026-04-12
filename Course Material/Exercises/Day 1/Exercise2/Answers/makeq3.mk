SHELL := /bin/bash

# Task 1:
# Populate a target called build-core-image with an @echo "Saying it is building the image"
# Populate the build-image with and @echo "cd ~/git/poky/ && source oe-init-build-env && bitbake core-image-minimal"


# Task 2:
# Create a target called clean-build
# Populate the clean-build with an @echo "Saying it is cleaning the build directory"
# Populate the clean-build with and @echo "cd ~/git/poky/ && source oe-init-build-env && bitbake -c cleanall"

# Targets
build-core-image: #Leave this line empty
echo "Building the core-iamge-minimal image"
cd ~/git/poky && source oe-init-build-env && bitbake core-image-minimal

clean-build:
echo "Cleaning the build directory"
@echo "cd ~/git/poky/ && source oe-init-build-env && bitbake -c cleanall core-image-minimal"

