// File: Student.java
class Student {
    int id;
    String n;

    // Added constructor to initialize both fields
    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        
        // Creating Student object using the new constructor
        Student s1 = new Student(10, "Alice");
        
        System.out.println(s1.id);  
        System.out.println(s1.n);  
    }
}
