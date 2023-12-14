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
