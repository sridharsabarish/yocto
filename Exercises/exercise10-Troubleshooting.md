Exercise on Troubleshooting



# How to :
- Take a working recipe from github, bitbake it and now deliberately make some errors and ask the students to fix it.
- Should be straight forward. 
- Needs access to ubunutu though
# Todo fill some content.


Maybe something like adding traces of differnet kind?
1. Add BB_ERROR to some
1. ADD BB_FATAL to some
1. Create dependency graph and visualize it for a recipe?
1. EXPLORE The logs from bitbake from a specific folder
1. Quiz on how to enable GDB and some info on GDB?

## Deliberately messup some line of the code.

## Go through bitbake -e vim | grep "^S="
## Explore log files
 log.do_<>.pid
## Dependency Graph
- Something about visualizing it in graphviz and seeing it for ourselves.
-  bitbake -g -u taskexp_ncurses example
- Check dependecy for other recipes
## Build with verbose flag 
 - Explore output and see what went wrong.

## Some more reifnment needed.