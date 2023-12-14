# Initial Try

Using the `Person.java` file in the `0. Notes` folder, can you describe each part of the class listed below? Complete the sentence that starts with "This is..." in this file (you are not writing code in `Person.java`). Try to provide as much detail as you can using vocabulary from the notes! The first one is filled in for you as an example to follow.

---

```java
private static String species = "Human";
```

This is...a class variable, which means it will be the same for every object and objects don't get their own copy of the variable. It appears that this will store the species of all people, which makes sense to be defined as "Human". It is private, so it will only be accessed from outside the class through accessor or mutator methods, but anything inside of the class can use it!

---

```java
private String name;
```

This is...

---

```java
private int age;
```

This is...

---

```java
public Person() {
    name = "";
    age = -1;
}
```

This is...

---

```java
public Person(String n, int a) {
    name = n;
    age = a;
}
```

This is...

---

```java
public String getName() {
    return name;
}
```

This is...

---

```java
public void setName(String n) {
    name = n;
}
```

This is...

---

```java
public int getAge() {
    return age;
}
```

This is...

---

```java
public void setAge(int a) {
    age = a;
}
```

This is...

---

```java
public void speak(String saying) {
    System.out.println(name + " says: " + saying);
}
```

This is...

---

```java
public int ageNextYear() {
    return age + 1;
}
```

This is...