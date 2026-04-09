
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


DEPENDS += "troubleshooting1"

do_create_directory() {

    bberror "Creating directory"
    install -d ${D}/home/root/myname
    install -d ${D}/home/root/myname
    
}

addtask create_directory before do_install

