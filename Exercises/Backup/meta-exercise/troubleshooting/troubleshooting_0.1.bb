
SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
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

do_create_directory() {

    bberror "Creating directory"
    install -d ${D}/home/root/myname
    install -d ${D}/home/root/myname
    
}

DEPENDS:remove = "magic"

addtask do_custom_copy after do_compile before do_install
addtask create_folder after do_compile
addtask create_directory before do_install
