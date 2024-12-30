# something is wrong with hello, what could it be?
hello:
	echo "This is a simple Makefile"
	echo "This line will print if the file hello does not exist."

# Maybe the target works as intended, but the file has a bug?
all: yocto_driver.c
     make -C /lib/modules/$(shell uname -r)/build M=$(PWD) modules

clean:
	make -C /lib/modules/$(shell uname -r)/build M=$(PWD) clean
# Eas y level -> Get the c file to run
# Intermediate level -> Get the shell script to run 
# Advanced level -> call the cpp file from the shell script.
