#include<linux/module.h>
#include<linux/init.h>

MODULE_LICENSE("MIT");
MODULE_AUTHOR("A Yocto Developer");
MODULE_DESCRIPTION("A simple example Linux module");

static int __init yocto_driver_init(void)
{
    printk(KERN_INFO "Hello from Yocto\n");
    return 0;
}

static void __exit yocto_driver_exit(void)
{
    printk(KERN_INFO "Goodbye Yocto\n");
}

module_init(hello_init);
module_exit(hello_exit);
