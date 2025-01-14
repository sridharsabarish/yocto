require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL += "openssh strace"
IMAGE_FSTYPES += "ext3 tar.bz2"
IMAGE_INSTALL:remove = "unzip"

IMAGE_ROOTFS_SIZE = "1024"

do makesoemthing:append() {

    bberror "Adding my own file"
    install -d ${IMAGE_ROOTFS}/home/root
    echo "This is your iamge now" > $(IMAGE_ROOTFS)/home/root/dummy_file

}

addtask makesoemthing after do_rootfs