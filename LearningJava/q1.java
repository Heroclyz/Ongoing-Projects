package LearningJava;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args)
    {
        System.out.print("Isminizi Giriniz:");
        Scanner input = new Scanner(System.in);
        String adSoyad = input.nextLine();
        System.out.println("Adiniz Soyadiniz:" + adSoyad);
        input.close();
    }
}
