FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "file://hello.c"

do_compile() {
    bbnote "Compiling the hello.c file"
    ${CC} ${WORKDIR}/hello.c ${LDFLAGS} -o hello
}

do_install() {
    bbnote "Installing the hello binary"
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}
}

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

