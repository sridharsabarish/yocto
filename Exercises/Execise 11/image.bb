DESCRIPTION = "A minimal image with some extra features"

require recipes-core/images/core-image-minimal.bb
IMAGE_FSTYPES += "ext3 tar.bz2"

IMAGE_ROOTFS_SIZE = "1024"

do_install_append () {
    install -d ${D}/home/root
    echo "This is your image now" > ${D}/home/root/dummy_file
}

