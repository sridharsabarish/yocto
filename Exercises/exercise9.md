# Exercise 9: Licenses


## Part 0
* Which folder can you use to find the licenses used by a recipe?
* Which license should we be careful about when working with commercial tools?
* 

## Part1: Identify the problematic recipe
* There is a recipe in our build system which is causing licensing issue.
* This recipe can be found in the meta-exercise layer, can you identify what is wrong with this recipe?
* Luckily this recipe is created by us, which means we could change the license of the recipe. Change it to a friendlier license.

## Part2: Compliance Checklist
* In the meta-experiments-new, we have a collection of recipes which might be lacking some license compliance.
* Luckily there is a shell script that could help catch these bug, but it is broken. Can you fill in and solve it?

```sh

some code
some bug
some code

```
* Run the code and check which recipes are missing.

### Part3 : oe-pkgdata-util explanation. SOmething on it?


## Part2: The bigger level
* Create a script that would go through the directory and find all the licenses.
Todo : Something with computervision? OpenCV?

* It could be fun to create a 




* It is a simple exercise, we need to find all the licenses in the current yocto build.
* find all the licenses of type MIT
* Find all the license of type GPL3 and so on
### Todo : Add more flavour and drama to the exercise

1. Build a License-Friendly Yocto Image



1. You need to find the .bb files and find the license it uses and group all the recipes by license.


| **Command**                                              | **Description**                                                            | **Example Usage**                                 |
|----------------------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------|
| `oe-pkgdata-util list-pkgs --licenses`                   | Lists all packages and their associated licenses                            | `oe-pkgdata-util list-pkgs --licenses`            |
| `oe-pkgdata-util list-pkgs`                              | Lists all packages built in the current Yocto environment                   | `oe-pkgdata-util list-pkgs`                       |
| `oe-pkgdata-util list-pkg-files <package-name>`           | Lists all files installed by a specific package                            | `oe-pkgdata-util list-pkg-files bash`             |
| `oe-pkgdata-util pkgdata --pkgname <package-name> --licenses` | Shows license-related information for a specific package                    | `oe-pkgdata-util pkgdata --pkgname bash --licenses` |
| `oe-pkgdata-util pkgdata --pkgname <package-name> --details` | Shows detailed information about a specific package, including license, dependencies, and metadata | `oe-pkgdata-util pkgdata --pkgname bash --details` |
| `oe-pkgdata-util check-licenses`                         | Checks for potential license conflicts in the Yocto build                   | `oe-pkgdata-util check-licenses`                  |
| `oe-pkgdata-util list-pkg-deps <package-name>`           | Lists the dependencies of a specific package                               | `oe-pkgdata-util list-pkg-deps bash`              |
