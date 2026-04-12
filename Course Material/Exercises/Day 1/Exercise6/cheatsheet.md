# Packaging

## Representation
 `${PE}:${PV}-${PR}`
 **PE** - 0 default
 **PV** - 1.0.0 or similar
 **PR** - r0 default

## Run time package dependencies
- `RDEPENDS` - Runtime dependencies
- `RPROVIDES` - Symbolic name provided by a package
- `RCONFLICTS` - Packages conflicting with a package
- `RREPLACES` - Symbolic names package can replace

## OE-PKGDATA-UTIL
Command line utility to deal with packages!


| **Command**                                     | **Description**                                                             | **Example Usage**                                 |
| ----------------------------------------------- | --------------------------------------------------------------------------- | ------------------------------------------------- |
| `oe-pkgdata-util list-pkgs`                     | Lists all packages built in the current Yocto environment                   | `oe-pkgdata-util list-pkgs`                       |
| `oe-pkgdata-util list-pkg-files <package-name>` | Lists all files installed by a specific package                             | `oe-pkgdata-util list-pkg-files bash`             |
| `oe-pkgdata-util package-info`                  | Shows information for a specific package                                    | `oe-pkgdata-util packag-info bash`                |

  


## Enabling support for different packaging format

* Different package formats in linux : 
    * debian
    * RPM
    * IPK

* Command to enable support    

```
PACKAGE_CLASSES:append = `package_deb` #for Debian
PACKAGE_CLASSES:append = `package_ipk` #for IPK`
PACKAGE_CLASSES:append = `package_rpm` #for Red Hat Package Manager (RPM)
```


