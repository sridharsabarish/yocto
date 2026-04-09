
SUMMARY = "Troubleshooting recipe"
DESCRIPTION = "Recipe for troubleshooting"
LICENSE = "MIT"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

inherit pkgconfig

PACKAGECONFIG ??="bug"
#PACKAGECONFIG ??="recipe1"
#PACKAGECONFIG ??="recipe65"

#Package config when declared wil have at max 6 argumetns, first two for some arguments, next two are dependencies, next 2 for something esle.
PACKAGECONFIG[bug] = "--with-big,--without-bug,,magical"
PACKAGECONFIG[recipe1] ="--with-recipe1,--without-recipe1,troubleshooting"
PACKAGECONFIG[recipe65] ="--with-recipe1,--without-recipe1,,troubleshooting65"
addtask create_folder before do_build 

do_create_directory() {

    bberror "Creating directory"
    install -d ${D}/home/root/myname
    install -d ${D}/home/root/myname
    
}

#addtask do_create_folder after do_compile
addtask do_create_directory before do_install


