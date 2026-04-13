# Some generic Troubleshooting Tips


## To grow partition of ubuntu when low space

- use the command below with caution!
```bash

sudo apt update  
sudo apt install cloud-guest-utils # contains growpart
sudo growpart /dev/sda 3
sudo resize2fs /dev/sda3

```

## To fix issues with build

```bash

bitbake -c cleansstate recipename
bitbake -c cleanall recipename


```


# License is missing or unknown

Set the license as closed in the recipe! (Note; this is just for practice, always set the correct license if you can.)
```make

#somerecipe.bb

 LICENSE=CLOSED


```

## Balena Etcher
* Run this as `administrator` #important 
* Most errors are resolved by quitting and restarting as administrator!



