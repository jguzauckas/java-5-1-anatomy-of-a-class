public class Student {
    private String firstName;
    private String lastName;
    private int idNumber;
    private int gradeLevel;

    public Student() {
        firstName = "";
        lastName = "";
        idNumber = -1;
        gradeLevel = -1;
    }

    public Student(String f, String l, int i, int g) {
        firstName = f;
        lastName = l;
        idNumber = i;
        gradeLevel = g;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public int getIDNumber() {
        return idNumber;
    }

    public int gradeLevel() {
        return gradeLevel;
    }

    public void finishYear() {
        gradeLevel++;
    }

    public String whoIsThis() {
        return idNumber + ": " + lastName + ", " + firstName + " - Grade " + gradeLevel;
    }

    public String fullName() {
        return firstName + lastName;
    }
}
