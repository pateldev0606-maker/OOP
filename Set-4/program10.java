package set;

import java.util.Scanner;

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Details:");
        String vNum = sc.next();
        String brand = sc.next();
        String fuel = sc.next();

        Vehicle v = new Vehicle(vNum, brand, fuel);

        System.out.println("\nEnter Car Details:");
        int seats = sc.nextInt();
        boolean ac = sc.nextBoolean();

        Vehicle v1 = new Car(vNum, brand, fuel, seats, ac); // upcasting

        System.out.println("\nEnter Electric Car Details:");
        double battery = sc.nextDouble();
        double charge = sc.nextDouble();

        Vehicle v2 = new ElectricCar(vNum, brand, fuel, seats, ac, battery, charge); // upcasting

        System.out.println("\n--- Vehicle Details ---");
        v.displayDetails();

        System.out.println("\n--- Car Details ---");
        v1.displayDetails();

        System.out.println("\n--- Electric Car Details ---");
        v2.displayDetails();

        if (v2 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v2;
            System.out.println("\nDowncasting Successful: Electric Car detected");
            ec.displayDetails();
        }

    }
}
