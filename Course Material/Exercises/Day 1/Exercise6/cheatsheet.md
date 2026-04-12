# Packaging

## Enabling support for different packaging format

debian, rpm,ipk and so forth!

PACKAGE_CLASSES:append = `package_deb` #for Debian
PACKAGE_CLASSES:append = `package_ipk` #for IPK
PACKAGE_CLASSES:append = `package_rpm` #for Red Hat Package Manager (RPM)
