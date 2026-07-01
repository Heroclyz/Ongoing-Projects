package LearningJava;

import java.util.Scanner;

public class q3 {
    public static void Summary(int sayi1,int sayi2)
    {
        int sum = sayi1+sayi2;
        System.out.print(sayi1+"+"+sayi2+"=" +sum);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number:");
        int sayi1 = input.nextInt();
        System.out.print("Enter The Second Number:");
        int sayi2 = input.nextInt();
        Summary(sayi1,sayi2);
        input.close();
    }
}