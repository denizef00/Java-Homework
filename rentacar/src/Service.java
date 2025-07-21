
public class Service {
    private final Car[] vehicles;
    private int vehicleCount;

    public Service(int capacity){
        this.vehicles = new Car[capacity];
        this.vehicleCount = 0;
    }

    public void addVehicle(String brand , String model) {
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount] = new Car(brand, model);
            System.out.println("Vehicle added!! \nPlate Number : " + vehicles[vehicleCount].getPlateNumber());
            vehicleCount++;
        } else {
            System.out.println("Vehicle capacity reached! No more vehicles can be added.");
        }
    }

    public Car findVehicle(int plateNumber) {
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getPlateNumber() == plateNumber) {
                return vehicles[i];
            }
        }
        return null;
    }
    public void listAllVehicle(){
        if (vehicleCount == 0){
            System.out.println("There are no vehicles registered in the system.");
        }else{
            System.out.println("------------- All Vehicle --------------");
            for (int i = 0; i < vehicleCount; i++) {
                vehicles[i].displayInfo();
            }
        }
    }

    public void listAvailableVehicle(){
        boolean hasAvailable = false ;
        for (int i = 0; i < vehicleCount; i++) {
            if(vehicles[i].isAvailable()){
                vehicles[i].displayInfo();
                hasAvailable = true;
            }
        }
        if (!hasAvailable){
            System.out.println("There are no available vehicles.");
        }
    }
}
