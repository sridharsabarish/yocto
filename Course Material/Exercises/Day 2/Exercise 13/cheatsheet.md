# Distro
* Personal branding for linux
* Distro layer needs to be created

A typical distro layer looks like this.

		├── distro
		│   ├── include
		│   │   ├──someincludes.inc
		│   │   ├── someinclude2inc
		│   ├── distro1.conf
		│   ├──distro2.conf
		├── layer.conf


* Distro layers need to be created and added using bitbake-layers.

* `DISTRO` variable control which distro is used. This can be set in local.conf

* some useful variable to know

	- `DISTRO= "yourdistro"` 
	- `DISTRO_NAME = "Name of your distro"` 
	- `DISTROOVERRIDES = "distro"`
	- `DISTRO_VERSION = "1.0.0"` 
	- `DISTRO_CODENAME = "your distro code name"`