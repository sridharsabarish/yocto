DESCRIPTION = "A simple recipe with 3 tasks and some error messages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=b97a012949927931feb7793eee5ed924"

#FILESEXTRAPATHS:prepend := ":${THISDIR}/files:"
DEPENDS = "glibc"

SRC_URI = "file://helloworld.c"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_compile() {
    bbwarn "THE SOUR IS" ${S}
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/helloworld.c -o ${S}/helloworld
}

do_install() {
    bberror "Installing"
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld ${D}${bindir}
}

do_error() {
    bberror "This is an error message"
    bbwarn "This is a warning message"
    bbnote "This is a note message"
}
