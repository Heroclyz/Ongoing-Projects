package LearningJava;

import java.util.Scanner;
class Student{
    public String name;
    public int age;
    public void display(Student stdnt)
    {
        System.out.println("Ilk Ogrenci Ismi:" + stdnt.name);
        System.out.print("Ilk Ogrenci Yasi:" + stdnt.age);
    }
}
public class q5 {
    public static void main(String[] args)
    {
        Student fname = new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("Isim Giriniz:");
        fname.name = input.nextLine();
        System.out.print("Yasini Giriniz:");
        fname.age = input.nextInt();
        fname.display(fname);
        input.close();
    }
}
