# In this makefile, we are not able to build the kernel module.
# Something is amiss, can you figure out what it is?
# Hint: What output do you see when you make build_kernel_module

obj-m += yocto-driver.o
hello:
	echo "This is a simple Makefile"
	echo "This line will print if the file hello does not exist."

build_kernel_module:    yocto-driver.c
	make -C /lib/modules/$(shell uname -r)/build M=$(PWD) modules

clean:
	make -C /lib/modules/$(shell uname -r)/build M=$(PWD) clean
# Eas y level -> Get the c file to run
# Intermediate level -> Get the shell script to run 
# Advanced level -> call the cpp file from the shell script.
