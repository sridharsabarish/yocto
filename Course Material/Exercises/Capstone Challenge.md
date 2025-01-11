
1. Create a linux distribution
	1. It should be form arm format
	2. Rootfs should be 1.5GB
	3. it should include support for STRACE
	4. It should not have - remove a lot of unwanted #todo
	5. You need to create a new layer for this and have 5 recipes inside
	6. All these recipes are to be present in this image.
	7. Also, the image should have the following things enabled in the kernel as a fragment.
		1. CAN (Change it)
		2. SOmething else
	8. It should have a bb append file
	9. The revision should be "0.666"
	10. It should be its own distro.
	11. It should have the following package support
		1. npm
		2. deb
		3. ipk
	root
	