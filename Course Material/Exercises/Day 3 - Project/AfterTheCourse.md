
# Capstone Challenge 

1. Create a linux distribution
	1. **Architecture :** It should be for `qemuarm` architecture.
	2. **Root file system** should be 10GB and should have an extra space of 1gb.
	3. **Packages :** Apart from the base packages, we need the following package
		packagegroup-core-full-cmdline-utils
		packagegroup-core-full-cmdline-multiuser 
		packagegroup-core-full-cmdline-dev-utils
		
        Hint : Remember to check  how core-image-full-cmdline add the packaging support. This has to do with package groups and you need to create your own image.

	4. **Recipes and layers**: There should be atleast 2 layers and 3 recipes in each of these layers and the recipe should create a file in your home folder. 
	5. **Customization :** Use package config to enable a dependency in your recipe.

	6. **Kernel :** Try to modify the kernel setttings, generate a cfg fragment and include the fragment. Some examples inlude support for CAN Bus. Be creative.
	7. **DISTRO :** A custom distro should be used. We can go with "afry" distro created in the previous section.
	8. **Pacakaging support :** It should have the following package support
		1. npm
		2. deb
		3. ipk
	9. Troubleshooting : Enable GDB and also include support for profiling.


**Note :** Remember to create Software Bill of material using
`INHERIT += "create-spdx"`



# References
1. [Creating your own distro](https://docs.yoctoproject.org/dev-manual/custom-distribution.html)
2. [DISTRO Layer](https://docs.yoctoproject.org/overview-manual/concepts.html#distro-layer)