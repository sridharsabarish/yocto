
# Cheat Sheet

## Bitbake Syntax

1. Append/prepend with spaces (`+=`)
1. Append/prepend without spaces (`.=`)
1. Immediate Expansion (`=:`)
1. Weak assignment (`?=`)
1. Override Syntax (`:append`, `:prepend`) - Guaranteed operations
1. `IMAGE_ROOTFS_TYPES = "ext4 tar.gz"`
1. Removal? `:remove`
    - Always done after append and prepend operations


