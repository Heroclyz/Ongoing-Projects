package LearningJava;
import java.util.Scanner;

class Electricity {
    private String number;
    private double consumption;
    private int type;
    
    public Electricity(String num, double consumption, int type) {
        this.number = num;
        this.consumption = consumption;
        this.type = type;
    }
    
    public double calculateBill() {
        double billAmount;
        if (this.type == 1) {
            billAmount = this.consumption * 1.5;
        } else {
            billAmount = this.consumption * 2.5;
        }
        
        if (billAmount < 50) {
            billAmount = 50;
        }
        
        return billAmount;
    }
    
    public void showBillInfo() {
        System.out.println("Subscriber Number = " + this.number);
        System.out.println("Consumption Amount = " + this.consumption);
        if (this.type == 1) {
            System.out.println("Subscriber Type = Residential");
        } else {
            System.out.println("Subscriber Type = Commercial");
        }
        System.out.println("Bill Amount to Pay = " + calculateBill());
        System.out.println("-----------------------------");
    }
}

public class q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 4, i;
        Electricity[] electricity = new Electricity[n];
        
        for (i = 0; i < n; i++) {
            System.out.print("Enter Subscriber Number: ");
            String subscriber = input.nextLine();
            
            System.out.print("Enter Consumption Amount: ");
            double subscriberConsumption = input.nextDouble();
            
            System.out.print("Enter Subscriber Type (1-Residential / 2-Commercial): ");
            int type = input.nextInt();
            
            electricity[i] = new Electricity(subscriber, subscriberConsumption, type);
            input.nextLine(); // Satır sonu karakterini (Enter) temizlemek için
        }
        
        double sum = 0;
        for (i = 0; i < n; i++) {
            System.out.println("\t" + (i+1) + ". Subscriber Information");
            electricity[i].showBillInfo();
            sum += electricity[i].calculateBill();
        }
        
        System.out.println("Total Bill Amount = " + sum);
        input.close();
    }
}