

package LearningJava;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args)
    {
        int sutun,satir,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Satir Olsun:");
        sutun = input.nextInt();
        System.out.print("Kac Sutun Olsun:");
        satir = input.nextInt();
        int[][] arr = new int[sutun][satir];
        for(i=0;i<sutun;i++)
        {
            for(j=0;j<satir;j++)
            {
                System.out.print("Iki Boyutlu Dizi Elemanlarini Giriniz:");
                arr[i][j] = input.nextInt();  
            }
        }
        for(i=0;i<sutun;i++)
        {
            for(j=0;j<satir;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
