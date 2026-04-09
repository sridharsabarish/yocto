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

# One of the command below will solve the dependency issue which one?
#PROVIDES += "packages2"
#PROVIDES += "spell"
#PROVIDES +="magic"
#PROVIDES +="magical"

#PACKAGES = "packagegroup-test"
PACKAGE_CLASSES:remove = "package_rpm"
