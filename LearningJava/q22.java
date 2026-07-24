package LearningJava;

import java.util.Scanner;

public class q22 {

    public static int fibonacci(int number)
    {
        if(number==0)
        {
            return 0;
        }
        else if(number == 1)
        {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);

    }
    public static void main(String[] args)
    {
        int number,fibnumber;
        Scanner input = new Scanner(System.in);
        System.out.print("last fibonacci number:");
        number = input.nextInt();
        if(number < 0)
        {
            System.out.println("Wrong Input! Please Choose Positive Numbers.");
        }
        else 
        {
            fibnumber = fibonacci(number);
            System.out.println("Fibonacci Number:" + fibnumber);
        }


        input.close();
    }
}
