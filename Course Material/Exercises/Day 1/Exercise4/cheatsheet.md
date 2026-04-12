# Metadata

## Shareable

1. Classes `.bbclass` - supports META_DATA and functions
1. include `.inc`  - supports only META_DATA and not functions


## Recipes `.bb` and Recipes Extensions `.bbappends`
* Recipes can be thought of as a simple component you would like to build for example `flask`, `python`, `bash`
* `SRC_URI` is used to specificy location for fetch
* `do_install`,`do_configure`,`do_compile`, and other tasks are performed by a recipe.
* `LICENSE` and `LIC_FILES_CHKSUM` are mandatory!!

* `.bbappend` used to extend an existing recipe! It takes the existing recipe and adds some more info on top of that!


