import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service rentalService = new Service(5);

        while (true){
            System.out.println("---------- Rent A Car ------------");
            System.out.println("1. Add Car");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. List All Car");
            System.out.println("5. List Available Car");
            System.out.println("6. Exit");

            System.out.println("Please enter command index : ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            if (choice == 1){
                System.out.println("Enter car brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter car model: ");
                String model = scanner.nextLine();
                rentalService.addVehicle(brand, model);
            } else if (choice == 2) {
                rentalService.listAllVehicle();
                System.out.println("Please enter the license plate number of the vehicle you wish to rent:");
                int plateNumber = scanner.nextInt();
                Car car1 = rentalService.findVehicle(plateNumber);
                if (car1 != null){
                    car1.rentVehicle();
                    System.out.println(car1.getBrand() + " is rented!!");
                }else {
                    System.out.println("Vehicle not found!");
                }
            } else if (choice == 3) {
                System.out.println("Please enter the license plate number of the vehicle you wish to return: ");
                int plateNumber = scanner.nextInt();
                Car car2 = rentalService.findVehicle(plateNumber);
                if (car2 != null){
                    car2.returnVehicle();
                    System.out.println(car2.getBrand() + " is returned!!");
                }else {
                    System.out.println("Vehicle not found!");
                }
            } else if (choice == 4) {
                rentalService.listAllVehicle();
            } else if (choice == 5) {
                rentalService.listAvailableVehicle();
            } else if (choice == 6) {
                System.out.println("EXIT!!");
                break;
            }else {
                System.out.println("Invalid Command!!");
            }


        }
    }
}