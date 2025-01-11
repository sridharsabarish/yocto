SUMMARY = "One ring to rule them all, one recipe to bind them"
DESCRIPTION = "Recipe created by bitbake-layers with additional metadata"
HOMEPAGE = "https://github.com/sridharsabarish/yocto-experiments"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "1.0+git${SRCPV}"
PR = "r1"

# Custom metadata
RING_INSCRIPTION = "One ring to rule them all, one ring to find them, one ring to bring them all, and in the darkness bind them"
MIDDLE_EARTH_REGION = "The Shire"
ENEMY_NAME = "Sauron"
ENEMY_DOMAIN = "Mordor"

do_display_banner() {
    bbwarn "***********************************************"
    bbwarn "*                                             *"
    bbwarn "*  Example recipe created by bitbake-layers   *"
    bbwarn "*                                             *"
    bbwarn "*  Version: ${PV}                             *"
    bbwarn "*  Revision: ${PR}                            *"
    bbwarn "*  License: ${LICENSE}                        *"
    bbwarn "*  ${RING_INSCRIPTION}                        *"
    bbwarn "*  ${MIDDLE_EARTH_REGION}                     *"
    bbwarn "*  Enemy: ${ENEMY_NAME} of ${ENEMY_DOMAIN}    *"
    bbwarn "*                                             *"
    bbwarn "***********************************************"
}

do_print_message() {
    bbnote "This is a message from do_print_message()"
    bbnote "${RING_INSCRIPTION}"
    bbnote "${MIDDLE_EARTH_REGION}"
    bbnote "Beware of ${ENEMY_NAME} from ${ENEMY_DOMAIN}"
}

addtask display_banner before build
addtask print_message after compile

