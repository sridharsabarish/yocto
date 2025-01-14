inherit magic
require wizard.inc
SUMMARY = "A comprehensive recipe demonstrating various tasks and logging levels using Harry Potter's spells"
PR = "r1"

do_cast_configuration_spell() {
    echo "Casting a configuration spell"
    bbwarn "${MAGIC_SPELL} - This is a warning beware of the dark arts"
    bbplain "  * Checking for dependencies, making sure we have all the wands in ${S}"
}

do_brew_potion() {
    echo "Brewing a ${MAGIC_POTION}"
    bbplain "  * Compiling potion.c - adding a pinch of ${MAGIC_CREATURE} magic in ${D}"
    bbplain "  * Creating potion.o - the elixir is taking shape"
}

do_apply_protective_charm() {
    bbnote "Adding a protective charm, taught by Professor ${MAGIC_STUDENT}"
    touch "${WORKDIR}/protective_charm.txt"
}

do_display_wizard_title() {
    bbnote "The mighty wizard ${WIZARD_NAME} - ${WIZARD_TITLE} of ${WIZARD_HOUSE}"
}

do_banish_unwanted() {
    echo "Cleaning build artifacts - banishing the unwanted, a trick learned at ${MAGIC_SCHOOL}"
    bbfatal "${MAGIC_SPELL} - Fatal error during clean up, the dark arts have intervened"
}

FILES:${PN} += "${bindir}/first"

SRC_URI = "git://github.com/sridharsabarish/yocto-experiments.git;protocol=https;branch=master"

# Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus sit amet nulla auctor,
# vestibulum magna sed, convallis ex. Cum sociis natoque penatibus et magnis dis parturient
# montes, nascetur ridiculus mus. Nulla vitae elit libero, a pharetra augue. Integer posuere
# erat a ante venenatis dapibus posuere velit aliquet. Nullam quis risus eget urna mollis
# ornare vel eu leo. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis
# vestibulum. Aenean lacinia bibendum nulla sed consectetur. Aenean eu leo quam.
# Some more bitbake variables relevant for recipes but simple to follow:
# * SRC_URI: The URI of the source code
# * S: The source directory
# * BUILD_DIR: The build directory
# * D: The install directory
# * WORKDIR: The directory where the build happens
# * DEPLOY_DIR_IMAGE: The directory where the final image gets deployed
# Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus sit amet nulla auctor,
# vestibulum magna sed, convallis ex. Cum sociis natoque penatibus et magnis dis parturient
# montes, nascetur ridiculus mus. Nulla vitae elit libero, a pharetra augue. Integer posuere
# erat a ante venenatis dapibus posuere velit aliquet. Nullam quis risus eget urna mollis
# ornare vel eu leo. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis
# vestibulum. Aenean lacinia bibendum nulla sed consectetur. Aenean eu leo quam.