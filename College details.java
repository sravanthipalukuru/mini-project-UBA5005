class Student {
    String name;
    int rollNo;
    static String college = "saveetha college";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("College: " + college);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "John";
        s1.rollNo = 1;

        Student s2 = new Student();
        s2.name = "Mary";
        s2.rollNo = 2;

        s1.display();
        s2.display();
    }
}