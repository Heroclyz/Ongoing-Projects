package DegreeConverter;

import java.util.Scanner;

public class degreeconverter {

    public static double calculate(int choice, double temperature)
    {

    double degree;

    if(choice == 1)
    {
        degree = temperature * (9.0/5.0) + 32;
        return degree;
    }
    else if(choice == 2)
    {
        degree = (temperature - 32) * (5.0/9.0);
        return degree;
    }
    else if(choice == 3)
    {
        degree = temperature + 273.15;
        return degree;
    }
    else if(choice == 4)
    {
        degree = temperature - 273.15;
        return degree;
    }
    else
    {
        return 0;
    }
    }


    public static void main(String[] args)
    {
        char continuee = 'E';
        int choice;
        double temperature,result;
        Scanner input = new Scanner(System.in);


        do {

        System.out.println("Degree Converter");
        System.out.println("1- Celsius to Fahrenheit");
        System.out.println("2- Fahrenheit to Celsius");
        System.out.println("3- Celsius to Kelvin");
        System.out.println("4- Kelvin to Celsius");
        System.out.print("Choose Between (1-4)");
        choice = input.nextInt();

        System.out.print("Enter the Temperature = ");
        temperature = input.nextDouble();


        if(choice == 1)
        {
            result = calculate(choice,temperature);
            System.out.println(result + " Fahrenheit");
        }
        else if(choice == 2)
        {
            result = calculate(choice,temperature);
            System.out.println(result + " Celsius");
        }
        else if(choice == 3)
        {
            result = calculate(choice,temperature);
            System.out.println(result + " Kelvin");
        }
        else if(choice == 4)
        {
            result = calculate(choice,temperature);
            System.out.println(result + " Celsius");
        }
        else
        {
            System.out.println("Invalid Choice! Choose Between (1-4)");
            continue;
        }


        System.out.println("Would you like to convert another degree: (Y/y -> Yes || N/n -> No)");
        continuee = input.next().charAt(0);


        }while(continuee == 'Y' || continuee == 'y');

        input.close();
    }
}
