# Recipes Creation

## Recipestool
* To create a recipe (Best)
`recipetool create -o (yourrecipe.bb) (source: usually a github link)`
* `--srcbranch` flag can be used to specify which branch you want to base your recipe from.

## devtool (Advanced SDK)
* To create a recipe
`devtool create -o (yourecipe.bb) (source:githublink)`


## logging and log levels

* Syntax : `bbtype "message"`, 
* Subtle difference between python and shell.
* Log levels (shell): ` bbplain`, `bbwarn`, `bberror`, `bbnote`, `bbfatal`
* Log levles (python): ` bb.plain`, `bb.warn`, `bb.error`, `bb.note`, `bb.fatal`


## Classes and includes
* Remember to create folders with the names "classes" and "includes" in your layerdirectory and name the files `.bbclass` and `.inc`.
* `Inherit` keyword is used for classes and `include` used for `.inc` files.
* `require` keyword expect a file to be present where as `include` is a bit less stict.