package LearningJava;

import java.util.Scanner;

class Araba{
    private String Company;
    private String Model;
    private int Year;

    public void setCompany(String company)
    {
        this.Company = company;
    }
    public String getCompany()
    {
        return Company;
    }
    public void setModel(String model)
    {
        this.Model = model;
    }
    public String getModel()
    {
        return Model;
    }
    public void setYear(int year)
    {
        this.Year = year;
    }
    public int getYear()
    {
        return Year;
    }

    public void display()
    {
        System.out.println("Arabanin Yapildigi Sirket = " + Company);
        System.out.println("Arabanin Markasi = " + Model);
        System.out.println("Arabanin Yapildigi Yil = " + Year);
        System.out.println("---------------------------------------------");
    }
}

public class q8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 3,i;
        Araba[] arabalar = new Araba[n];

        for(i=0;i<n;i++)
        {
            System.out.print("Arabanin Yapildigi Sirketi Giriniz:");
            String company = input.nextLine();
            System.out.print("Arabanin Markasini Giriniz:");
            String model = input.nextLine();
            System.out.print("Arabanin Yapildigi Yili Giriniz:");
            int year = input.nextInt();
            System.out.println("---------------------------------------------");
            arabalar[i] = new Araba();
            arabalar[i].setCompany(company);
            arabalar[i].setModel(model);
            arabalar[i].setYear(year);
            input.nextLine();
        }
        System.out.println("------------------------Arabalarin Bilgileri------------------------");
        for(i=0;i<n;i++)
        {
            arabalar[i].display();
        }
        input.close();
    }
}
