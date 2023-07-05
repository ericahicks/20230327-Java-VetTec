# Angular Review

Angular is a component-based framework for building single-page web applications.
Components can be swapped out dynamically without reloading the whole page (like multi-page web applications).

A component is a reusable part of the user interface that encapsulates its own structure, behavior, and styles.

## Most Missed Questions on Quiz

- Which of the following are valid class property declarations in typescript? (Select all that apply.)

```
class MyClass {
      // code goes here
}
```

TypeScript has:
- for block scope variables we've got var, let, const
    -- the devault is var if you don't specify
- for class scope variables we've got private, protected, and public
    -- the default is public if you don't specify an access modifier

Answer Options:

~var myVar = 3;~
~number myVar = 3;~ // notation is name: type = value;
                    // if no type is specified, it tries to imply it from the assignment
                    // if no value is assigned during declaration, it defaults to a type of any
~let myVar = 3;~
~myVar: var = 3;~ // this is an invalid use of the keyword var -- must  be used before the variable (here it expects a  valid type)
CORRECT myVar: number = 3;
CORRECT myVar = 3; 

- What is the proper way to receive data in a name variable through property binding?

Inside of the child's component.ts file, we
```
@Input() name? : string;
```

What is the proper way to share data in a name variable through property binding?

Inside the parent component.html, we use []
<child-element [name]="data"></child-element>
//              ----   ----- is data a variable in the parent class or the child class? parent
//               /\
//               ||
//              is name a variable in the parent class or the child class? child

- Data pipes update the value stored in teh variable being passed in.

FALSE - only changes how it is displayed (not the value itself being saved)



