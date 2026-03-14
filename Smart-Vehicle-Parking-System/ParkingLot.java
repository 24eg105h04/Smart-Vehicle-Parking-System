import java.util.ArrayList;

class ParkingLot {

    int capacity;
    ArrayList<Vehicle> parkedVehicles;

    ParkingLot(int capacity) {
        this.capacity = capacity;
        parkedVehicles = new ArrayList<>();
    }

    void parkVehicle(Vehicle v) {
        if (parkedVehicles.size() < capacity) {
            parkedVehicles.add(v);
            System.out.println("Vehicle parked successfully.");
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    void removeVehicle(String number) {
        for (Vehicle v : parkedVehicles) {
            if (v.vehicleNumber.equals(number)) {
                parkedVehicles.remove(v);
                System.out.println("Vehicle removed.");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    void showAvailableSlots() {
        System.out.println("Available Slots: " + (capacity - parkedVehicles.size()));
    }
}