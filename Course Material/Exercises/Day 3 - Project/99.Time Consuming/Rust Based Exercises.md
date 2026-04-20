
## 1. Install Support for RUST


### Precaution

#### Increase Space for VM
* Also it could be an idea to increase the space avaialble for VM, delete unnecessary files! 

* Follow the instruction or reach out to me on how to increase the space. 
    * It is a bit different with Virtual Box VMs

*  **Note:** This could be done in a secondary computer (as it might take 3-4 hours)!

* Try to add rust to IMAGE_INSTALL and try to build it!


### Adding RUST and cargo

```shell
IMAGE_INSTALL +="rust cargo"

```
* Note this will take around 3-4 hours.
* once done, try to create a new project using 
`cargo new hello-world`
* `cd hello-world` and run `cargo run` to run your own rust code!!!!!!!!!!!



