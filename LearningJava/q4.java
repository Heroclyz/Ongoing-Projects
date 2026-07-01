package LearningJava;

public class q4 {
    public static int faktoriyel(int n)
    {
        if(n != 0)
        {
            return n * faktoriyel(n-1);
        }
        else
        {
            return 1;
        } 
    }
    public static void main(String[] args)
    {
        int sonuc = faktoriyel(5);
        System.out.print("5 Sayisinin Faktoriyeli:" + sonuc);
    }
}
