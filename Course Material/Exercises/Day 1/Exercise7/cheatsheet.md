# Recipe Customization

## Append file `.bbappend`
- Content added back of recipe
### Wilcard Matching `%`
- 2.3.4.bbappend for version 2.3.4
- 2.3.%.bbappend for version 2.3.y
- 2.%.bbappend valid for version 2.x and 2.y
- %.bbappend valid for all!


### Extending task
`append` or `prepend` operator to task


### Patch
- Git diff
- `SRC_URI` variable must be populated
- `SRC_URI+="file://patchname.patch"`

### Extra conf files
- Install needs to be implemented


### Package config

- Modifies recipe behaviour using flag like setting.
- `PACKAGECONFIG` variable to be set
- 6 values **arg1,arg2,build_deps,run_deps,RRECOMMENDS, RCONFLICT**
