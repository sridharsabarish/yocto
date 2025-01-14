
# Cheat Sheet


# Poky

### Setup Dev Env

* `source oe-init-env.sh`

### local.conf
* OG conf, overrides everything.
* No version control, bad practice to use.

### Compile a Recipe/Image

* `bitbake core-image-minimal` - The base image with minimal features
* `bitbake core-image-full-cmdline` - Complete CLI Linux image

### Starting QEMU

* `runqemu`



# Bitbake Syntax

1. Append/prepend with spaces (`+=`)
1. Append/prepend without spaces (`.=`)
1. Immediate Expansion (`=:`)
1. Weak assignment (`?=`)
1. Override Syntax (`:append`, `:prepend`) - Guaranteed operations
1. `IMAGE_ROOTFS_TYPES = "ext4 tar.gz"`
1. Removal? `:remove`
    - Always done after append and prepend operations



# Recipes

## Find recipes
`bitbake-layers show-recipes `


## Create a recipe

### Manual 
* Find a `*.bb` file and use as reference

### Recipe tools

* `recipetool create -o OUTFILE source`


### Devtool
* `devtool add source`


##  Tasks

### Add tasks
``` cpp

do_taskname() {
    content
}

addtask taskname after do_fetch before do_compile // use existing tasks 

```

### Deleting Tasks
`deltask taskname`
## Dependencies

`DEPENDS` - build dependency
`RDEPENDS` - Runtime dependency


# Packages

## Representation
 `${PE}:${PV}-${PR}`
 **PE** - 0 default
 **PV** - 1.0.0 or similar
 **PR** - r0 default

## Run time package dependencies
- `RDEPENDS` - Runtime dependencies
- `RPROVIDES` - Symbolic name provided by a package
- `RCONFLICTS` - Packages conflicting with a package
- `RREPLACES` - Symbolic names package can replace

## OE-PKGDATA-UTIL
Command line utility to deal with packages!

# Recipe Customization

## Append file `.bbappend`
- Content added back of recipe
### Wilcard Matching `%`
- 2.3.4.bbappend for version 2.3.4
- 2.3.%.bbappend for version 2.3.y
- 2.%.bbappend valid for version 2.x and 2.y
- %.bbappend valid for all!


### Extending task
`append` or `prepend` operator to task


### Patch
- Git diff
- `SRC_URI`used to append
- `SRC_URI+="file://patchname.patch"`

### Extra conf files
- Install needs to be implemented


### Package config

- Modifies recipe behaviour using flag like setting.
- `PACKAGECONFIG` variable to be set
- 6 values **arg1,arg2,build_deps,run_deps,RRECOMMENDS, RCONFLICT**

# Troubleshooting
## Track Variable

* `bitbake -e  | grep "^VARIABLE"`

## Dependency Graph 

- `bitbake -g <Recipe>`
- `bitbake -g -u taskexp_ncurses  <recipe>` for visuals

## Bitbake Environment

`bitbake -e recipename | grep "^METADATANAMAE"`

## Logs in Yocto

- Failed logs Found at `${WORDIR}/temp/log.do_{taskname}`
- Commands can be see at `run.do_{taskname}`

## Log levels

   `bbwarn`, `bberror`, `bbnote`, `bbfatal`, `bbplain`, `bbdebug`




# Application Development

## Extensible SDK

### Devtool

* `devtool modify recipe`

* `devtool update recipe`

* `devtool reset recipe`







## Devshell

1. `bitbake recipename -c devshell`
2. Make changes

### Patch Creation

* `git format-patch ~1`


3. `git format-patch ~1` to create a patch!
4. Close devshell.



# Metadata
## Conf

### Local.conf

* `MACHINE` - This variable is set to configure architecture qemux86-64,etc.
* No Version control, so don't use unnecessarily

### BBLAYERS.conf

* Layers should be added here.

### Layer.conf

* Layer specific Metadata





## Useful Locations

* Images
    - /build/tmp/
* License
    - /build/tmp/deploy/licenses/
* Source code?
    - /build/tmp/work/sources






# Layers

1. Create a new layer
`bitbake-layers create-layer <layername>`
2. Add layer
`bitbake-layers add-layer <layername>`

3. Show layers
`bitbake-layers show-layers`



# Steps to make a patch with devtool

1. `devtool modify <recipe_name>`
2. Make changes
3. `devtool build <recipe_name>` to check it builds
4. `devtool update <recipe_name>` to update and build patches.
5. Ensure `SRC_URI += "File://*.patch"`
6. `devtool reset <recipe_name>` to remove from workspace layer.





# IMAGES
Top level recipe used to build RootFile System.
1. `IMAGE_INSTALL += "package"` -To add a package to Image.
1. `IMAGE_FS_TYPES` - to change file system type
1. `IMAGE_ROOTFS_SIZE`

 

