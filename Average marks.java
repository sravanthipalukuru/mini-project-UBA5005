import java.util.Scanner;
class Student {
    int m1, m2, m3;
    void getMarks(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }
    void calculateAverage() {
    double avg = (m1 + m2 + m3) / 3;
    System.out.println("Average: " + avg);
}
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Student s = new Student();
        s.getMarks(m1, m2, m3);
        s.calculateAverage();
    }
}