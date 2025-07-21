public class Car {
    private static int plateCounter = 100;
    private final int plateNumber;
    private final String brand;
    private final String model;
    private boolean isAvailable;

    public Car(String brand, String model) {
        this.plateNumber = ++plateCounter;
        this.brand = brand;
        this.model = model;
        this.isAvailable = true;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rentVehicle(){
        if (isAvailable){
            isAvailable = false;
            System.out.println(brand + " " + model + " is rented!");
        } else {
            System.out.println("This car already rented!!");
        }
    }

    public void returnVehicle(){
        isAvailable = true;
        System.out.println(brand + " " + model + " is returned!!");
    }

    public void displayInfo(){
        System.out.println("Plate: " + plateNumber + " | Brand: " + brand + " | Model: " + model + " | Status: " + (isAvailable ? "Available" : "Rented"));
    }
}
