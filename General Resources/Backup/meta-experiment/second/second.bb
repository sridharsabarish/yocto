DEPENDS = "glibc"
SRC_URI = "file://helloworld.c"

S="${WORKDIR}/source"
UNPACKDIR = "${S}"

do_compile() {

    bbwarn "The source is " ${S}
    ${CC} ${CFLAGS} ${LDGLAGS} ${S}/helloworld.c - o ${S}/helloworld


}


do_install(){
    bb_error "Installing"
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld ${D}${bindir}


}

do_error() {

    bberror "This is an error message"
    bbwarn "This is a warning"
    bbnote "This is a note"
}