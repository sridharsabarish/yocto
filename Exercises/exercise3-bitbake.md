# Exericse : Treasure Hunt

## Learning outcomes:
- Familiarizing with Bitbake Syntax

## Introduction

- Understanding BitBake variable syntax is crucial for configuring and controlling the build process in the Yocto Project.
- Bitbake syntax is similar to Make, however there are some nuances.


## Some Hints : 
For the entire exercise, you can refer to
- [Bitbake Syntax]("https://docs.yoctoproject.org/bitbake/bitbake-user-manual/bitbake-user-manual-metadata.html)


## Part 1 : Getting Started
1. A very simple assignment.


    ```sh

    A = "Hej \
         Hola \
         Salut \
         "
    ```

    **Question:**  If i print *A*, how many lines would it contain?


1.  Expanding Variables   
   
    ```sh
    B = "Yocto"
    C = "Embedded"
    D = "{B}{C}"
    B = "Open"
    E = "D{C}"

    ```
    **Question:** What is the value of **D & E?**

1. Default Values (?=)

    ```sh
    CANDY? ="Licorice"
    FIKA = "Kanelbulle"
    CANDY = "M&M"
    DRINK ?= "COFEE"
    DRINK ?= "TEA"
    FIKA ?= "Pan au chocolat"
    
    ```
    c. I would drink _ with my _ while munching _.

1. Weak deafults (??=)
    
    Note: This expands immediately when empty and also replaces previous  weak defaults values.

    ```sh
    SUMMER??="JULY"
    WINTER="DECEMBER"
    VACATION??="MARCH"
    SUMMER??="AUGUST"
    WINTER??="FEBRUARY"
    ```
    **Question :** What are the values for SUMMER and WINTER?

## Part 2: Expansions  and Appends



1. Immediate expansion and Appends

    ```sh
    C = "Summery"
    A :="Hello ${C}"
    C = "Wintery"
    A +="Sweden"
    B ="Hello"
    B .="OpenEmbedded"
    ```

    **Question:** What is the value of A and B?

    Hint
    Things to focus:
    - Append with spaces
    - Append without spaces
    - Immediate expansion


1. Overrides Style Syntax (append and prepend)

    ```sh
    MACHINE = "intel"
    MACHINE:append = "amd"
    MACHINE2 ="amd"
    MACHINE2:prepend ="intel " 
    MACHINE3 ="intel amd"
    MACHINE4 ="intelamd"
    MACHINE5 = "intel amd "

    ```
    **Question** : Which machines are the same? 

1. Removal

    ```sh

    HERO = "Romeo"
    AUTHOR = "Shakespeare"
    AUTHOR:prepend = "William-"
    REMOVE_HERO ="Macbeth Othello"
    HERO +="Antonio"
    HERO +="Balthasar"
    HERO +="Othello"
    HERO +="Macbeth"
    HERO:remove = "$REMOVE_HERO"
    REMOVE_HERO ="Macbeth Balthasar"

    ```

    Question: What is the name of the Author and who are the heros?

1. Override vs normal
    
    **Consider a BBCLASS, a class.**

    ```sh
    //FRUIT.bbclass
    FRUIT1 +="TOMATO"
    FRUIT2:append = " TOMATO"
    ```
    
    **Actual code**

    ```bash
    
    inherit FRUIT
    FRUIT1 = "Durian"
    FRUIT2 = "Durian"
    ```

    **Are fuit 1 and fruit 2 same?**

    


## Part 3: Conditional Metadata 

1. Overrides

    ```sh

        OVERRIDES="fruit:french:food"
        HELLO = "How are you doing?"
        HELLO:french ="Comment ça va?"
        B="HELLO"
        C="${HELLO}"
       
       ```
   What is the value of B and C?

1. Overrides with appends

   ```sh
    OVERRIDES="qemu:qemux86-64:arm:qemux86"
    SUPPORTED_MACHINES ="intel"
    UNSUPPORTED_MACHINES="amd"
    SUPPORTED_MACHINES:append:qemux86 ="qemux86"
    UNSUPPORTED_MACHINES:append:intel="intel"

   ```
   What is the value of `SUPPORTED_MACHINES` and `UNSUPPORTED_MACHINES`?

1. Appends and prepends
    ```sh
    DEPENDS ="vim gcc python"
    OVERRIDES ="vscode:powerpoint:paint"
    DEPENDS:append:vscode =" .NET3.5"
    DEPEMDS:prepend:vscode =".NET Core "

    ```

    What is the value of `DEPENDS` if we use the override VSCODE?

1. Multiple overrides
    ```sh

    DEPENDS = "vim bash nano"
    DEPENDS:vscode= ".net-core bash"
    DEPENDS:powerpoint=".net-core"
    DEPENDS:pages="swift xcode"
    DEPENDS:virutalbox="windows"
    ```

    What would be the value of DEPENDS?
    1. If override is set?
    1. If override is not set?
## Part 4 : Cracking the Code

Okay, now that you are familiar with Bitbake syntax, there is one final puzzle.

```bash
OVERRIDES= ":germen:"

SUMMARY = "Mystery Package"
DESCRIPTION = "A mysterious package"
LICENSE = "MIT"

DECRYPT_LOGIC="Shift right by 1"
INITIAL_CODE:= "GDKKN"

SRC_URI ?= "https://github.com/sridharsabarish/yocto/blob/main/General%20Resources/quiz.md"

SRC_URI ??= "https://github.com/sridharsabarish/yocto/blob/main/General%20Resources/cheatsheet2.md"

SRC_URI = "https://github.com/sridharsabarish/yocto/blob/main/General%20Resources/cheatsheet.md"


SUMMARY .= "s"
DESCRIPTION +="that could change the "

WORLD ="WORLD"
WORLD:german ="WELT"

DESCRIPTION .="${WORLD}"
CRACKED_CODE ="$(WORLD)"
INITIAL_CODE+= "VNQKC"
CRACKED_CODE:prepend="HELLO "


```

* What is the value of SRC_URI?
* What is the description?
* Is cracked_Code the cesar's cipher of the initial code?