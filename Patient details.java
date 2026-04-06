import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patient[] = new String[5];
        int count = 0;
        int choice;
        do{
        System.out.print("Enter choice (1-Add,2-View,3-Search,4-Delete,5-Exit): ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter name: ");
                patient[count] = sc.next();
                count++;
            }

            if(choice == 2){
                for(int i=0;i<count;i++)
                    System.out.println(patient[i]);
            }

            if(choice == 3){
                System.out.print("Search name: ");
                String name = sc.next();
                for(int i=0;i<count;i++)
                    if(patient[i].equals(name))
                        System.out.println("Found");
            }
            if(choice == 4){
                System.out.print("Delete name: ");
                String name = sc.next();
                for(int i=0;i<count;i++)
                    if(patient[i].equals(name))
                        patient[i] = "Deleted";
            }

        }while(choice != 5);

    }
}