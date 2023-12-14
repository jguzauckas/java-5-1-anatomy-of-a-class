# Basics Check

Using the `Student.java` file, can you describe each part of the class listed below? Complete the sentence that starts with "This is..." in this file (you are not writing code in `Person.java`). Try to provide as much detail as you can using vocabulary from the notes!

---

```java
private String firstName;
```

This is...

---

```java
private String lastName;
```

This is...

---

```java
private int idNumber;
```

This is...

---

```java
private int gradeLevel;
```

This is...

---

```java
public Student() {
    firstName = "";
    lastName = "";
    idNumber = -1;
    gradeLevel = -1;
}
```

This is...

---

```java
public Student(String f, String l, int i, int g) {
    firstName = f;
    lastName = l;
    idNumber = i;
    gradeLevel = g;
}
```

This is...

---

```java
public String getFirstName() {
    return firstName;
}
```

This is...

---

```java
public void setFirstName(String f) {
    firstName = f;
}
```

This is...

---

```java
public String getLastName() {
    return lastName;
}
```

This is...

---

```java
public void setLastName(String l) {
    lastName = l;
}
```

This is...

---

```java
public int getIDNumber() {
    return idNumber;
}
```

This is...

---

```java
public int gradeLevel() {
    return gradeLevel;
}
```

This is...

---

```java
public void finishYear() {
    gradeLevel++;
}
```

This is...

---

```java
public String whoIsThis() {
    return idNumber + ": " + lastName + ", " + firstName + " - Grade " + gradeLevel;
}
```

This is...

---

```java
public String fullName() {
    return firstName + lastName;
}
```

This is...