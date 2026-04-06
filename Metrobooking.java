import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String from = sc.nextLine();
        String to = sc.nextLine();
        double distance = sc.nextDouble();

        double farePerKm = 5; 
        double totalFare = distance * farePerKm;

        System.out.println("Passenger Name: " + name);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Distance: " + distance);
        System.out.println("Total Fare: " + totalFare);
    }
}