public class Main {

    int year;
    String model;
    Main(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public static void main(String[] args) {
        Main car = new Main(2020, "sedan");
        System.out.println("Car Year: " + car.year);
        System.out.println("Car Model: " + car.model);
    }
}
