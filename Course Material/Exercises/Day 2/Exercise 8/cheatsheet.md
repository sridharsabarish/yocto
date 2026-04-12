# Layers

1. Create a new layer
`bitbake-layers create-layer <layername>`
2. Add layer
`bitbake-layers add-layer <layername>`

3. Show layers
`bitbake-layers show-layers`
4. Remove-layer 
`bitbake-layers remove-layer <layername>`

## Layer Priority
* Higher the number, higher the priority of the layer

## Generic
* Layer.conf defines the priority and other layer specific values

* All layers must be added in `BBLAYERS.conf` for bitbake to include them. If not done, it is not visible.