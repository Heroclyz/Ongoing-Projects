package LearningJava;

import java.util.Scanner;

class Kargo {
    private String takipKodu;
    private int gonderiTipi;
    private double agirlik;

    public Kargo(String takipKodu, double agirlik, int gonderiTipi)
    {
        this.takipKodu = takipKodu;
        this.agirlik = agirlik;
        this.gonderiTipi = gonderiTipi;
    }
    public void Kargobilgileri()
    {
        String gonderiTipiMetin = "";

        if(this.gonderiTipi == 1)
        {
            gonderiTipiMetin = "Standart";
        }
        else if(this.gonderiTipi == 2)
        {
            gonderiTipiMetin = "Hizli";
        }
        else 
        {
            gonderiTipiMetin = "Hatali Giris!";
        }
        System.out.println("Gonderi Takip Kodu = " + this.takipKodu);
        System.out.println("Gonderi Agirligi = " + this.agirlik);
        System.out.println("Gonderi Tipi = " + gonderiTipiMetin);
    }
    public double gonderiUcret()
    {
        double hesaplananUcret=0;
        if(gonderiTipi == 1)
        {
            hesaplananUcret = this.agirlik * 0.5;
        }
        else if(gonderiTipi == 2)
        {
            hesaplananUcret = this.agirlik * 0.8;
        }


        if(hesaplananUcret < 20)
        {
            hesaplananUcret = 20;
        }

        return hesaplananUcret;
    }


}
public class q6{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Kargo Bilgisi Girilecek:");
        int N = input.nextInt();
        input.nextLine();
        int i;
        Kargo[] kargolar = new Kargo[N];

        for(i = 0;i < N; i++)
        {
            System.out.println((i+1) + ". Kargo Bilgilerini Giriniz:");

            System.out.print("Kargo Takip Kodu:");
            String takipkodu = input.nextLine();
            System.out.print("Kargo Agirligi:");
            double agirlik = input.nextDouble();
            System.out.print("Kargo Gonderi Tipi:");
            int gonderitipi = input.nextInt();
            input.nextLine();
            kargolar[i] = new Kargo(takipkodu,agirlik,gonderitipi);
            System.out.println("------------------------------------");
        }
        for(i=0;i<N;i++)
        {
            double sonuc = kargolar[i].gonderiUcret();
            System.out.println("" +(i+1) +". Kargo Bilgileri    ");
            kargolar[i].Kargobilgileri();
            System.out.println("Kargonun Ucreti = " + sonuc);
            System.out.println("-----------------------------------");
        }

        input.close();
    }
}
