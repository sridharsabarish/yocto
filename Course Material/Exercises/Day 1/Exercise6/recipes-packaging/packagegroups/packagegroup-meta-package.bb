DESCRIPTION = "Package Group"
LICENSE = "MIT"
SUMMARY = "Package group for our recipes"


inherit packagegroup

## Add the packages apt, strace and alsa to the RDEPENDS variable
RDEPENDS_packagegroup-test = "  \
    magic             \ 
    spell       \
    cat \
"
