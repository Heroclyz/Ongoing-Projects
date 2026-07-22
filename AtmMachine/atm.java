package AtmMachine;

import java.util.Scanner;

class bankAccount
{
    private String name;
    private double balance;

    bankAccount(String accountName, double accountBalance)
    {
        this.name = accountName;
        this.balance = accountBalance;
    }

    public void displayInfo()
    {
        System.out.println("Account Name = " + this.name);
        System.out.println("Account Current Balance = " + this.balance);
    }

    public void withdrawMoney(double amount)
    {
        if(this.balance < amount)
        {
            System.out.println("You dont have Enough Money in your Account!");
        }
        else 
        {
            this.balance -= amount;
            System.out.println("New Balance = " + this.balance);
        }
    }

    public void depositMoney(double Amount)
    {
        this.balance += Amount;
        System.out.println("New Balance = " + this.balance);
    }
}


public class atm {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        String name;
        double firstdeposit,depositAmount,withdrawAmount;

        System.out.print("Account Name:");
        name = input.nextLine();
        System.out.print("Enter the Amount you Have:");
        firstdeposit = input.nextDouble();

        bankAccount account = new bankAccount(name,firstdeposit);

        do
        {
            System.out.println("1- Deposit Money");
            System.out.println("2- Withdraw Money");
            System.out.println("3- Show Account Info");
            System.out.println("4- Close the Menu");


        choice = input.nextInt();

        if(choice == 1)
        {
            System.out.print("How much would you like to deposit :");
            depositAmount = input.nextDouble();
            account.depositMoney(depositAmount);
        }
        else if(choice == 2)
        {
            System.out.print("How much would you like to Withdraw :");
            withdrawAmount = input.nextDouble();
            account.withdrawMoney(withdrawAmount);
        }
        else if(choice == 3)
        {
            account.displayInfo();
        }
        else if(choice == 4)
        {
            System.out.println("Exitting the Menu! Have a Nice Day!");
        }
        else 
        {
            System.out.println("Wrong Input! Choose Again!");
        }
        }while(choice != 4);



        input.close();
    }

}
