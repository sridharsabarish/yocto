SHELL := /bin/bash

install-toaster : 
	pip3 install --user -r bitbake/toaster-requirements.txt 
# Target to start Toaster
start-toaster:
	@echo "Starting Toaster..."
	cd ~/work/poky/poky/ && source oe-init-build-env && source toaster start

# Target to stop Toaster
stop-toaster:
	@echo "Stopping Toaster..."
	cd ~/work/poky/poky/ && source oe-init-build-env && source toaster stop

# Task : Create a target restart-toaster depends on stop-toaster and start-toaster
restart-toaster: # something is missing here
	@echo "Restarted Toaster" 

