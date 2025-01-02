# Exericse : Treasure Hunt

- BitBake variable syntax is crucial for configuring and controlling the build process in the Yocto Project.

//More refinement on this needed.
- Variables in BitBake are defined using the = or := operator, where = is used for normal assignment and := for immediate assignment. 
 

 ## Relevant example
 For example, SRC_URI = "http://example.com/source.tar.gz" specifies the source URL, while DEPENDS += "library" adds dependencies.
 
 
  The use of `${}` allows variable interpolation, like  `SRC_URI = "${PV}.tar.gz"`, dynamically referencing other variables. 
  
  ## Why?
  Understanding and using BitBake variable syntax is important because 
  - it allows fine-grained control over the build process, 
    - enabling users to 
    - configure,
    -  customize, 
    - and extend recipes for specific embedded Linux requirements.

## Exercises

- Without using your computer, try to guess the answer what the output of a specific exercise would be.
- If unclear, you can refer to the notes or run it in on your VM!

// Refine
Way to test : bitbake -e ^VARIABLE recipename


Q1. A very simple assignment.


```sh

A = "Hello"
B = "Yocto"
C = "Embedded"
D = {A}{B}
echo $B
echo $A
echo $D
```

Q2. Guess the output - With minor Append Operations
 Remember we can append with and without spaces!
```sh

A = "Hello"
B = "Yocto"
C = {A}{B}
A +="Sweden"
B .="OpenEmbedded"
echo $B
echo $A

```



Q3. Guess the output - Conditional Assignment

```sh
 A?="Work"
 B??="Home"
 A="Cat"
 A:="Dog"
 print $A
 print $B
 
```


Q3. Guess the output - Now with a little twist

```sh

A = "Hello"
B = "Yocto"
C = {A}{B}
A .=" Sweden"
B =+"OpenEmbedded"
echo $B
echo $A

```



Q4. Guess the output - Now with a little twist

```sh

A = "Hello"
A:french = "Bonjour,"
B = "Yocto"
B:french = "comment ca va?"
C = {A}{B}
A:append =" Sweden!"
B =+ "OpenEmbedded"
echo $B
echo $A

```

Q4. Guess the output - Now with a little twist


## Time to override

- Overrides changes the way variables behave, how does the order change?

```local.conf

OVERRIDES += "french:spanish"

```



```sh

A = "Hello"
A:french = "Bonjour!"
B = "Yocto"
B:french = "comment ca va?"
C = {A}{B}
A .=" Sweden"
B =+"OpenEmbedded"
echo $B
echo $A
```


# todo more below


## Something to get them started.
* Think of 4-5 simple exercises for them.
* With Hints and answers


You have before you a coin with the world illuminati inscribed on it and you find a piece of puzzle that contains the hidden meaning of the word illuminiati. Solve the piece of puzzle to keep going,.

// Todo : Clean up the code below and make it a bit easier.

```sh

Hello = "Hello!"
Hello ?= "Hej!"

C += $A
Hello:french = "Bonjour!"
C:override = "This was a joke"
E= "This $A"
D:open =+ $E $C
F += "Caramel"
F ?= $D
G ?= $H
H = $A $B $C 
Illuminati = $H

```






* What does illuminati mean?
    * It should be something witty and fun! #todo

    <details>
<summary>hint1</summary>
Link to the page.
</details>


## Advanced Exercises

// Todo