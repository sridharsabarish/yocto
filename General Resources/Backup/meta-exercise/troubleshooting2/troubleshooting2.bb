

# Idea

DEPENDS += "magic"

do_create_folder() {

bb.warn "Creating folder in a file"


}

do_create_directory() {

    bberror "Creating directory"
    install -d ${D}/home/root/myname
    install -d ${D}/home/root/myname
    
}

DEPENDS:remove = "magic"

addtask do_custom_copy after do_compile before do_install
addtask create_folder after do_compile
addtask create_directory before do_install
