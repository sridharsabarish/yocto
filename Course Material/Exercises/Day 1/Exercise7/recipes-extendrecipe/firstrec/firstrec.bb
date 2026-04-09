SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


# These two relevant from this version of yocto
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"



python do_display_banner() {
    bb.plain("**************cpp*********************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}


addtask display_banner before do_build

CAT1 = "Alfred"
CAT2 = "Bea"
CAT3 = "Cory"
PR = "r12"
PE = "4"






FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
CFLAGS += "-Wno-error=incompatible-pointer-types"
# Add the patch too
#SRC_URI += "file://nameofpath.extension"
# how should this be for our patch?
# Add the C File
#SRC_URI += "file://filename.extension" # to fill



FILES:${PN} +="${sysconfdir}/hello.c"

