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

As you might be able to discern, 








# Informal Code Analysis

With the ability to write loops under our belts, it is time to consider how they run by evaluating existing code. The two ways we can consider doing that is the ideas of **statement execution counts** and **information runtime comparisons**.

---

## Statement Execution Counts

When we are provided a loop, we can often be asked "how many times will this particular line of code be run?". Going through and counting up all the times that this happens is referred to as the statement's **execution count**. Here is an example from the `NotesCount1.java` file:

```java
for (int i = 0; i < 15; i++) {
    System.out.print("Hello, World!");
}
```

Someone might ask "how many times is `System.out.print("Hello, World!");` executed in the program?". We know that this is executed as many times as the loop is run, which will happen for `i` from `0` to `14`, which is 15 times. Our final answer would be something like "The statement execution count of `System.out.print("Hello, World!");` is 15."

We could also ask about an internal part of the loop as well, like "how many times is `i < 15;` executed in the program?". We can use our previous answer to help find this one. In this case, we know the loop runs it's internal block 15 times based on our previous answer. The `boolean` condition of the loop will get run for each iteration, so we know it gets run 15 times as well. There is an extra piece here, however, which is that the `boolean` condition is run an extra time to provide the value `false` and end the loop, which means it really gets processed 16 times. Our final answer would be something like "The statement execution count of `i < 15;` is 16."

Sometimes the provided code isn't a loop that runs a predetermined number of times and will be based on a variable, like this example from the `NotesCount2.java` file:

```java
public static void sampleMethod(int number) {
    for (int i = 0; i <= number; i++) {
        System.out.println("Hello, World!");
    }
}
```

Someone might ask "how many times is `System.out.print("Hello, World!");` executed in the method?". We know that this is executed as many times as the loop is run, which will happen for `i` from `0` to `number`. Unfortunately, we don't know the value of `number`, just that it is an integer. It would make sense then that the loop can get run more or fewer times depending on the value of number. Since we can't say a definitive number like 15 from our previous example, we can answer instead using the variable `number`. If `i` counts from `0` to `number`, we can plug in a couple of values to see the behavior. Plugging in `5` for `number` would go from `0` to `5`, which is 6 executions. Plugging in `10` for `number` would go from `0` to `10`, which is 11 executions. The pattern here appears to be running 1 more time than the value provided, which could be written as `number + 1`. Our final answer would be something like "The statement execution count of `System.out.print("Hello, World!");` is `number + 1`."

We could also ask about an internal part of the loop as well, like "how many times is `i <= number;` executed in the program?". We can use our previous answer to help find this one. In this case, we know the loop runs it's internal block `number + 1` times based on our previous answer. The `boolean` condition of the loop will get run for each iteration, so we know it gets run `number + 1` times as well. There is an extra piece here, however, which is that the `boolean` condition is run an extra time to provide the value `false` and end the loop, which means it really gets processed `number + 1 + 1` times, or `number + 2` times. Our final answer would be something like "The statement execution count of `i <= number;` is `number + 2`."

Sometimes statements are within more than one loop at a time, as introduced in Unit 4 Section 4 with nested iteration. Here is an example from the `NotesCount3.java` file:

```java
for (int i = 1; i < 10; i++) {
    for (int j = 0; j <= 10; j++) {
        System.out.println("Hello, World!");
    }
}
```

Someone might ask "how many times is `System.out.print("Hello, World!");` executed in the method?". This is a more complicated question than in the previous examples, because there are two loops that affect this statement. At the same time, this is an easier example since the two loops both run a specified number of times. Since the outer loop goes from `1` to `9`, we know that it will iterate 9 times. Since the inner loop goes from `0` to `10`, we know that it will iterate 11 times. The important factor here is that for every execution of the outer loop, the inner loop will go through all its iterations. So if the outer loop runs 9 times, for each of those 9 times, the inner loop will run all of its 11 times. This means that our statement is run `9 * 11` times, or 99 times. Our final answer would be something like "The statement execution count of `System.out.print("Hello, World!");` is 99."

We could also ask about an internal part of the loop as well, like "how many times is `j <= 10;` executed in the program?". We can use some of the ideas from our previous answer to help find this one. When the inner loop is run, we know from previous work that the `boolean` condition is run one more time than the rest of the loop, so since the loop goes 11 times, the `boolean` condition must be run 12 times. We can do multiplication again because the `boolean` condition must be executed 12 times for every run of the outer loop, which we know from the previous answer is 9 times. So the `boolean` condition is checked `9 * 12` or 108 times. Our final answer would be something like "The statement execution count of `j <= 10;` is 108."

The final and most difficult form of these questions is nested loops where the inner loop depends on the outer loop, like this example from the `NotesCount4.java` file:

```java
for (int i = 0; i < 10; i++) {
    for (int j = 1; j <= i; j +=2) {
        System.out.println("Hello, World!");
    }
}
```

Now the question "how many times is `System.out.print("Hello, World!");` executed in the method?" is pretty convoluted. The convolution comes from the inner loop, which changes how many times it runs over time, based on how far along the outer loop is. To best answer this question, we have to determine what is happening to the inner loop as the outer loop runs. 
- When the outer loop first runs, `i` is set to `0`. When we go to the inner loop, `j` is set to `1`, and it immediately fails the `boolean` condition since `1 <= 0` is `false`. So for the first iteration of the outer loop, there are no executions of the print statement.
- We continue with the outer loop to increment `i` to `1`. When we go to the inner loop, `j` becomes `1`, and this time we can execute the print statement because `1 <= 1` is `true`. We only execute once though, because `j` gets increased to `3`, and `3 <= 1` is `false`.
- We continue with the outer loop to increment `i` to `2`. When we go to the inner loop, `j` becomes `1`, and we can execute the print statement because `1 <= 2` is `true`. We again fail the second time though, since `j` gets increased to `3`, and `3 <= 2` is `false`.
- We continue with the outer loop to increment `i` to `3`. When we go to the inner loop, `j` becomes `1`, and we can execute the print statement twice because `1 <= 3` and `3 <= 3` are both `true`. We fail the third time though, since `j` gets increased to `5`, and `5 <= 3` is `false`.

There is a pattern here. First we run 0 times, then we run 1 time twice in a row, then we run 2 times twice in a row, etc. We just have to figure out how the pattern will end as our loop goes higher.

- Outer loop has `i` as `8`. Inner loop will run for `j` when it is `1`, `3`, `5`, and `7`, so we get 4 executions.
- Outer loop has `i` as `9`. Inner loop will run for `j` when it is `1`, `3`, `5`, `7`, and `9`, so we get 5 executions.

When we look at it all together, the inner loop will run the print statement the following numbers of times as the outer loop keeps calling it: 0, 1, 1, 2, 2, 3, 3, 4, 4, 5. As a quick check for ourselves, the outer loop has 10 repetitions, and we have 10 values for the inner loop. All we have to do is add up these executions, and we can see that the print statement gets run `0 + 1 + 1 + 2 + 2 + 3 + 3 + 4 + 4 + 5`, or `25` times. Our final answer would be something like "The statement execution count of `System.out.print("Hello, World!");` is 25."

---

## Informal Runtime Comparison

The other way we might consider how code runs is by comparing the relative **runtimes** of two sections of code that try to produce the same output. Runtime is typically measured in time, as how long the computer takes to process something in seconds, minutes, or hours. It is much simpler though, to just consider how much work the computer is doing to produce the outputs and reason about which one is doing more work. Here are two examples from the `NotesRuntime1.java` file that both print out the odd numbers from 1 to 10:

```java
// Approach 1
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 1) {
        System.out.println(i);
    }
}

// Approach 2
for (int i = 1; i <= 10; i += 2) {
    System.out.println(i);
}
```

Both of these examples successfully print the odd numbers from 1 to 10, but one of them is considered more **efficient** because it would have a shorter runtime. Can you predict which one it is?

Approach 1 utilizes an `if` statement to determine if a number is odd, then printing it if it is. Most importantly, it goes through every number from 1 to 10 and will do this check. We might think of statement execution counts here, but maybe in the form of "how many boolean checks are performed?". Using our work from above, we can reasonable determine that the loop `boolean` condition is executed 11 times, and the `if` statement is processed the `10` times that the loop will run, resulting in `21` `boolean` conditions being checked.

Approach 2 utilizes a variable modification of adding 2 while starting at an odd number to get the odd numbers, removing the need for the `if` statement utilized by Approach 1. Looking at statement execution counts again here, the loop `boolean` condition is only checked `6` times here, resulting in `6` `boolean` conditions being checked.

When we summarize it by the execution counts, it is clear that Approach 2 has an advantage. The computer is doing less than a third of the work that it does in Approach 1, while getting the same result!

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
