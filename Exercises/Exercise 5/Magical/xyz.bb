inherit magic
require wizard.inc
SUMMARY = "A comprehensive recipe demonstrating various tasks and logging levels using Harry Potter's spells"
PR = "r1"

do_cast_configuration_spell() {
    echo "Casting a configuration spell"
    bbwarn "${MAGIC_SPELL} - This is a warning beware of the dark arts"
    bbplain "  * Checking for dependencies, making sure we have all the wands"
}

do_brew_potion() {
    echo "Brewing a ${MAGIC_POTION}"
    bbplain "  * Compiling potion.c - adding a pinch of ${MAGIC_CREATURE} magic"
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

