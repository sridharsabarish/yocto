SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

python do_display_banner() {

    pe = d.getVar('PE', True)
    pv = d.getVar('PV', True)
    pr = d.getVar('PR', True)


    bb.plain("***********************************************");
    bb.plain("*   1.23                                          *");
    bb.plain("*  Epoch  ${pe}:Revision ${pr}- Version ${pv}   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
