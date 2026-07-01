package LearningJava;

import java.util.Scanner;
class Students{
    private String name;
    private int schoolno;
    private int classroom;

    public Students(String Name, int schoolNo, int classRoom)
    {
        this.name = Name;
        this.schoolno = schoolNo;
        this.classroom = classRoom;
    }
    public void display()
    {
        System.out.println("Ogrenci Ismi:" + this.name);
        System.out.println("Ogrenci Numarasi:" + this.schoolno);
        System.out.println("Ogrenci Sinifi:" + this.classroom);
        System.out.println("--------------------------");
    }
}
public class q7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 2,i;
        Students[] Student = new Students[n];

        for(i=0;i<n;i++)
        {
            System.out.print((i+1)+". Ogrencinin Ismini Giriniz:");
            String name =  input.nextLine();
            System.out.print((i+1)+". Ogrencinin Okul Numarasini Giriniz:");
            int schoolno = input.nextInt();
            System.out.print((i+1)+". Ogrencinin Sinifini Giriniz:");
            int classroom = input.nextInt();
            Student[i] = new Students(name,schoolno,classroom);
            System.out.println("-----------------------");
            input.nextLine();
        }
        for(i=0;i<n;i++)
        {
            Student[i].display();
        }
        input.close();
    }
}
