import java.util.Scanner;

public class ParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot(5);

        while(true) {

            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Check Available Slots");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String num = sc.next();

                    System.out.print("Enter Vehicle Type: ");
                    String type = sc.next();

                    Vehicle v = new Vehicle(num, type);
                    lot.parkVehicle(v);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number: ");
                    String removeNum = sc.next();
                    lot.removeVehicle(removeNum);
                    break;

                case 3:
                    lot.showAvailableSlots();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}