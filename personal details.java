import java.util.Scanner;
class Person {
    String name;
    int age;
    void getPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Main {
public static void main(String[] args) {
        Person p = new Person();
        p.getPersonDetails();
        p.display();
    }
}