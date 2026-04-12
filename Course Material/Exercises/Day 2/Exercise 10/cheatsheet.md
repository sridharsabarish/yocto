# Troubleshooting


## Bitbake Environment

`bitbake -e recipename | grep "^METADATANAMAE"`

## Logs in Yocto

- Failed logs Found at `${WORDIR}/temp/log.do_{taskname}`
- Commands can be see at `run.do_{taskname}`

## Log levels

   `bbwarn`, `bberror`, `bbnote`, `bbfatal`, `bbplain`, `bbdebug`


## Dependency Graph 

- `bitbake -g <Recipe>`
- `bitbake -g -u taskexp_ncurses  <recipe>` for visuals



## Devshell

1. `bitbake recipename -c devshell`
2. Make changes

### Patch Creation

3. `git format-patch -1` to create a patch!
4. Close devshell.