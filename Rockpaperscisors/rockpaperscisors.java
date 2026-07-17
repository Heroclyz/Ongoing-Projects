package Rockpaperscisors;
import java.util.Random;
import java.util.Scanner;


public class rockpaperscisors
{

    public static int game(char player, char computer)
    {
        if(player == computer)
        {
            return -1;
        }
        else if((player == 'R' && computer == 'S') || (player == 'P' && computer == 'R') || (player == 'S' && computer == 'P'))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        char player,computer;
        int result;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Game of Rock Paper Scisors");
        System.out.print("for Rock type 'R', for Paper type 'P', for Scissors type 'S'");
        player = input.next().toUpperCase().charAt(0);

        if(player != 'R' && player != 'P' && player != 'S')
        {
            System.out.println("Incorrect input!");
            input.close();
            return;

        }

        int n = random.nextInt(3);

        if(n==0)
        {
            computer = 'R';
        }
        else if(n==1)
        {
            computer = 'P';
        }
        else
        {
            computer = 'S';
        } 


        System.out.println("Player's Choice = " + player);
        System.out.println("Computer's Choice = " + computer);
        result = game(player,computer);

        if(result == -1)
        {
            System.out.println("Draw! Nobody Won!");
        }
        else if(result == 1)
        {
            System.out.println("Good Job! Player Won!");
        }
        else 
        {
            System.out.println("Unfortunately! Computer Won!"); 
        }

        input.close();
    }
}