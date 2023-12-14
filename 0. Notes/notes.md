# Anatomy of a Class

Java is an object-oriented programming language, and in Unit 2, we detailed how we can make and use objects, by constructing them, using methods, and more. Oftentimes we've used objects like `String` objects, or the `Integer` and `Double` wrapper classes, but sometimes we've used custom classes like the `Car` class or the `Person` class. In general, a class is a framework that offers bundled ************************uses************************. It can store information in various forms, perform actions or calculations, and more. In this section, we are going to untangle the pieces of a class so that in future sections we can tackle each of them one-by-one to be able to build classes ourselves.

---

## Breaking Down a Class

As a premise for our discussion, here is a `Person` class from the `Person.java` file:

```java
public class Person {
    private static String species = "Human";
    private String name;
    private int age;

    public Person() {
        name = "";
        age = -1;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void speak(String saying) {
        System.out.println(name + " says: " + saying);
    }

    public int ageNextYear() {
        return age + 1;
    }
}
```

Every class has three primary components: variables, constructors, and methods.

### Variables

The first three lines inside of the `Person` class shown above are variables:

```java
private static String species = "Human";
private String name;
private int age;
```

While there are some more keywords around, these are just like the variables we have been using all year. Each has a type (`String`, `String`, and `int`) and a name (`species`, `name`, and `age`). Just like before, you can either choose to assign a variable a value in the same line (initialization) like we did with `species`, or you can just declare the variable and assign it a value later like we did with `name` and `age`.

Clearly there is more of a difference between `species` vs. `name` and `age` because there is an additional keyword `static` in front of `species` that is not present with the other two. In classes, we have two main categories of variables: **class variables** and **instance variables**. The way these work comes down to what classes are used for: making objects.

When we use a class to make an object, it makes copies of variables, but not every variable. Objects get to make a copy of the instance variables, since they are expected to change with each object (like `name` and `age` in this situation). Objects do not get to make a copy of the class variables, since they are not expected to change, and the overall class will always control them, not the individual object (like `species` in this situation). We will delve more into the nuances of class variables in Unit 5 Section 7.

### Constructors

After our variables are defined in a class, we then define our constructors, which were these components from the `Person` class shown above:

```java
public Person() {
    name = "";
    age = -1;
}

public Person(String n, int a) {
    name = n;
    age = a;
}
```

Constructors are easy to identify because they have to share the name of the class (in this case, `Person`). They are the initial portions of code executed by a class when an object is being created. They often focus on setting up the instance variables (in this case, `name` and `age`), as undefined variables would be problematic for future work.

As you can see here, you can have multiple constructors. In order to have more than one constructor they have to have unique signatures. Signatures are unique via the combination of their name and the types in their parameter list. Since constructors all have to have the same name as the class, they can only be uniquely identified by the types in their parameter lists.

In our example, since the first constructor has an empty parameter list, and the other constructor has a parameter list with `String` and `int`, the computer is easily able to tell them apart: when it is not given any information, it uses the first one, when it is given a `String` and an `int` as the information, it uses the other.

The order of the parameter list is important as well, so we could make another constructor with the types `int` and `String` and that is considered unique from our existing constructor.

We refer to a constructor with no parameters as the **default constructor** (think of "default settings" in a game, it just sets it up the same way every time) and any constructors with parameters as **non-default constructors**.

### Methods

After the variables and constructors, everything else in a class is going to be methods, which was these components from the `Person.java` class shown above:

```java
public String getName() {
    return name;
}

public void setName(String n) {
    name = n;
}

public int getAge() {
    return age;
}

public void setAge(int a) {
    age = a;
}

public void speak(String saying) {
    System.out.println(name + " says: " + saying);
}

public int ageNextYear() {
    return age + 1;
}
```

Methods are the things that *do* in a class, they perform actions. The actions can be calculations, reading or modifying variables, printing, or pretty much anything else. This is where classes get a lot of their flexibility from. We are already somewhat familiar with these from our past work, what might be new is seeing where they come from in the class they were defined in.

Many classes will have certain kinds of methods most of the time. The main two are **accessor methods** and **mutator methods**. Both of these methods revolve around the variables of the class, and making them useful when we are using an object.

Accessor methods provide access to the information held by the variables in a class. They usually have the nickname **getter methods** as their goal is to *get* the information you ask for. You can see from this class that there is an accessor/getter method for each of the two instance variables `name` and `age`, named `getName` and `getAge` respectively. You can see from the way they are written that all they do is `return` the value of the variable in question, no trickery:

```java
public String getName() {
    return name;
}

public int getAge() {
    return age;
}
```

Mutator methods provide the ability to modify (or *mutate*) the information held by the variables in a class. They usually have the nickname **setter methods** as their goal is to *set* the variable to a new value. You can see from this class that there is also a mutator/setter method for each of the two instance variables `name` and `age`, named `setName` and `setAge` respectively. The ones written in this class just take in a new value as a parameter and assign it to the variable for you, but classes will often use logic here to decide whether or not to accept the input value (for example: would it make sense for me to set `age` to `-5` based on what we know about its purpose?). Additionally, some classes will be missing mutator/setter methods as there may be variables they don't want modified so easily. Here are the two from this class:

```java
public void setName(String n) {
    name = n;
}

public void setAge(int a) {
    age = a;
}
```

Outside of accessor and mutator methods, methods do a lot of different things. We have two more methods in this class that have very different functions!

First, we have the `speak` method, which takes in a `String` value and prints out some text that says their name and that they are talking before printing the provided `String` itself.

Second, we have the `ageNextYear` method, which doesn't require any parameters and just sends back the `int` value age of the object one year from now.

Here are these two methods:

```java
public void speak(String saying) {
    System.out.println(name + " says: " + saying);
}

public int ageNextYear() {
    return age + 1;
}
```

It is always important to pay attention to the `return` type of methods! `return` types are often just data types like `int` and `String` seen in some of the above examples, which means that the method **will** send back information of that type (not just can send that information, it has to!). `return` can also be `void` though, which just means that we are not expecting to send back any information (in our example above, the method either did its job silently or it printed instead).

Methods can do almost anything, often just limited by our imagination as programmers!

---

## `public` vs. `private`

There were two words we didn't discuss when looking at all of the examples above: `public` and `private`.

These are keywords in Java that help to define the idea of **scope**, which is thinking about where can you access different things from elsewhere in the program.

As you might be able to discern, `public` makes something more accessible, so you can access them from outside of the class itself. Examples of things that are always `public` are the class itself (`public class Person`) and constructors (`public Person()` and `public Person(String n, int a)`), which make sense because otherwise we'd never be able to make objects. Some things are often `public`, like methods (`public String getName()`, `public void setAge(int a)`, `public int ageNextYear()`, etc.), but could be `private`.

On the other hand, `private` makes things less accessible. In the case of a class, `private` makes something accessible only from within the class, and not externally. Examples of things that are almost always instance variables (`private String name`, `private int age`). We consider the data to be important and want to make sure they can only be accessed through the control of accessor and mutator methods.

A great way to think about it is when we are using objects. If I construct a `Person` object and assign it to the variable `person1`, then `public` things can be accessed via the dot operator `.`, while `private` things cannot. For example, `person1.getAge()` or `person1.speak("Hello!")` will both work since `getAge()` and `speak()` are both `public`, but `person1.name` would not work since the `name` instance variable is `private`.

---

## Data Encapsulation

The idea of **data encapsulation** is built using the ideas of `public` and `private` we just discussed. Something is **encapsulated** when it is only accessible within the class due to the use of the keyword `private`. Encapsulation is typically used on instance variables, and limits the use of something from external sources, but they are still made available through the use of accessor and mutator methods. The programmer that creates a class can decide how accessible an encapsulated piece of data is by deciding whether or not to include accessor and/or mutator methods. If there is concern that a value should not be changed, but should be accessed, then we would include an accessor method, but not a mutator method. There are four variations of encapsulation for a variable then:

- Not accessible or modifiable --> No accessor or mutator methods
- Accessible, but not modifiable --> Accessor method present, but no mutator method
- Modifiable, but not accessible --> Mutator method present, but no accessor method
- Both accessible and modifiable --> Both accessor and mutator methods present

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
