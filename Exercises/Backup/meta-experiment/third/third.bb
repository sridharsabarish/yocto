require recipes-core/images/core-image-base.bb

FILESEXTRAPATH:prepend := "${THISDIR}/${PN}"




IMAGE_INSTALL += "apt"
IMAGE_INSTALL += "openssh strace"
IMAGE_FSTYPES += "ext3 tar.bz2"
IMAGE_INSTALL:remove = "unzip"
IMAGE_LINGUAS = "pt-br de-de"
IMAGE_ROOTFS_SIZE = "1024"

do makesomething:append() {

    bberror "Adding my own file"
    install -d ${IMAGE_ROOTFS}/home/root
    echo "This is your iamge now" > $(IMAGE_ROOTFS)/home/root/dummy_file

}

addtask makesomething after do_rootfs 
