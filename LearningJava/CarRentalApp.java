package LearningJava;

import java.util.Scanner;

class Car {
    private String licensePlate;
    private int days;
    private int type;
    
    public Car(String licensePlate, int days, int type) {
        this.licensePlate = licensePlate;
        this.days = days;
        this.type = type;
    }
    
    public double calculateRentalCost() {
        double cost;
        if(this.type == 1) {
            cost = this.days * 800; // Economic
        } else {
            cost = this.days * 1500; // Luxury
        }
        
        // Minimum rental cost constraint
        if(cost < 1000) {
            cost = 1000;
        }
        return cost;
    }
    
    public void showCarDetails() {
        System.out.println("Car's License Plate = " + this.licensePlate);
        System.out.println("Number of Days to Rent = " + this.days);
        
        if(this.type == 1) {
            System.out.println("The Car Type is Economic!");
        } else {
            System.out.println("The Car Type is Luxury!");
        }
        
        System.out.println("Car's Rental Cost = " + calculateRentalCost());
        System.out.println("------------------------------------");
    }
}

public class CarRentalApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 3, i;
        Car[] cars = new Car[n];
        
        for(i = 0; i < n; i++) {
            System.out.print("Enter the car's license plate: ");
            String licensePlate = input.next();
            
            System.out.print("Enter the number of days to rent: ");
            int days = input.nextInt();
            
            System.out.print("Enter the car type (1 for Economic, 2 for Luxury): ");
            int type = input.nextInt();
            
            cars[i] = new Car(licensePlate, days, type);
        }
        
        double totalRevenue = 0;
        
        System.out.println("\n--- RENTAL SUMMARY ---");
        for(i = 0; i < n; i++) {
            System.out.println("\t" + (i + 1) + ". Car Details");
            cars[i].showCarDetails();
            totalRevenue += cars[i].calculateRentalCost();
        }
        
        System.out.println("Total Rental Cost for All Cars = " + totalRevenue);
        
        input.close();
    }
}