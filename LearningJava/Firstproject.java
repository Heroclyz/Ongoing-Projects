package LearningJava;
import java.util.Scanner;

class Elektrik
{
    private String numara;
    private double tuketim;
    private int tip;
    
    public Elektrik(String num, double tuketim, int tip)
    {
        this.numara = num;
        this.tuketim = tuketim;
        this.tip = tip;
    }
    
    public double FaturaHesapla()
    {
        double faturatutar;
        if(this.tip == 1)
        {
            faturatutar = this.tuketim * 1.5;
        }
        else
        {
            faturatutar = this.tuketim * 2.5;
        }
        if(faturatutar < 50)
        {
            faturatutar = 50;
        }
        
        return faturatutar;
    }
    public void FaturaBilgisiGoster()
    {
        System.out.println("Abone Numarasi = " + this.numara);
        System.out.println("Abone Tuketim Miktari = " + this.tuketim);
        if(this.tip == 1)
        {
            System.out.println("Abone Tipi = Mesken");
        }
        else
        {
            System.out.println("Abone Tipi = Ticari");
        }
        System.out.println("Abonenin Odeyecegi Fatura Tutari = " +FaturaHesapla());
        System.out.println("-----------------------------");
    }
}


public class Firstproject
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 4,i;
        Elektrik[] elektrik = new Elektrik[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Abone Numarasini Giriniz:");
            String abone = input.nextLine();
            System.out.print("Abone Tuketim Miktarini Giriniz:");
            double abonetuketim = input.nextDouble();
            System.out.print("(1-Mesken / 2-Ticari) Abone Tipini Giriniz:");
            int tip = input.nextInt();
            elektrik[i] = new Elektrik(abone,abonetuketim,tip);
            input.nextLine();
        }
        double sum = 0;
        for(i=0;i<n;i++)
        {
            System.out.println("\t" + (i+1) + ". Abone Bilgileri");
            elektrik[i].FaturaBilgisiGoster();
            sum += elektrik[i].FaturaHesapla();
        }
        System.out.println("Toplam Fatura Tutari = " + sum);
        input.close();
    }
}
