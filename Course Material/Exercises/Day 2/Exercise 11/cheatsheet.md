# Application Development

## Extensible SDK

### Devtool
* utility that is part of advanced SDK of Yocto

* `devtool modify recipe`

* `devtool update recipe`

* `devtool reset recipe`


# Steps to make a patch with devtool

1. `devtool modify <recipe_name>`
2. Make changes
3. `devtool build <recipe_name>` to check it builds
4. `devtool update <recipe_name>` to update and build patches.
5. Ensure `SRC_URI += "File://*.patch"`
6. `devtool reset <recipe_name>` to remove from workspace layer.


