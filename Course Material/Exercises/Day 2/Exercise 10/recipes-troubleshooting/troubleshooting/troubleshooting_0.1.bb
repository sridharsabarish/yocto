
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



do_create_folder() {

bb.warn "Creating folder in a file" 



}

addtask create_folder before do_build 

do_create_directory() {

    bberror "Creating directory"
    install -d ${D}/home/root/myname
    install -d ${D}/home/root/myname
    
}

#addtask do_create_folder after do_compile
addtask do_create_directory before do_install


