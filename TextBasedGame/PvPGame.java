package TextBasedGame;

import java.util.Scanner;

class Player
{
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int baseDmg;

    public Player(String Name, int Maxhp, int basedmg)
    {
        this.name = Name;
        this.maxHp = Maxhp;
        this.baseDmg = basedmg;
        this.hp = maxHp;
    }

    public String getName()
    {
        return name;
    }
    public int getHp()
    {
        return hp;
    }
    public boolean isAlive()
    {
        return (hp>0);
    }
    
    public void resetHp() 
    {
        this.hp = this.maxHp;
    }

    public void takeDmg(int damage)
    {
        hp -= damage;
        if(hp<0)
        {
            hp=0;
        }
        System.out.println(name + " just took " + damage + " Damage!");
        System.out.println(name + "'s Current HP = " + hp);
    }

    public void attack(Player Target)
    {
        System.out.println(name + " attacks " + Target.getName() + " for " + baseDmg + " damage.");
        Target.takeDmg(baseDmg);
    }
    public void heal()
    {
        hp += (maxHp*0.2);
        if(hp > maxHp)
        {
            hp = maxHp;
        }
        System.out.println(name + " decided to heal himself!");
        System.out.println(name + "'s Current HP = " + hp);
    }
}

class Warrior extends Player
{
    public Warrior(String name)
    {
        super(name,120,17);
    }
    @Override 
    public void attack(Player Target)
    {
        System.out.println(name + " swings a Great BattleAxe at " + Target.getName());
        Target.takeDmg(baseDmg);
    }
}

class Mage extends Player
{
    public Mage(String name)
    {
        super(name,80,30);
    }
    @Override
    public void attack(Player Target)
    {
        System.out.println(name + " casts a powerfull spell against " + Target.getName());
        Target.takeDmg(baseDmg);
    }
}

public class PvPGame {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("--- CHARACTER CREATION ---");
        Player player1 = createPlayer(input,"Player 1");
        Player player2 = createPlayer(input, "Player 2");

        boolean playAgain = true;

        while (playAgain) {
            
            player1.resetHp();
            player2.resetHp();

            System.out.println("\n--- BATTLE BEGINS ---");
            System.out.println(player1.getName() + " is Fighting " + player2.getName());

            boolean isPlayer1Turn = true;

            while(player1.isAlive() && player2.isAlive())
            {
                Player activePlayer;
                Player targetPlayer;
                if (isPlayer1Turn)
                {
                    activePlayer = player1;
                    targetPlayer = player2;
                }
                else
                {
                    activePlayer = player2;
                    targetPlayer = player1;
                }
                System.out.println("\nIt's " + activePlayer.getName() + "'s Turn! (HP: " + activePlayer.getHp() + ")");
                System.out.println("1-Attack");
                System.out.println("2-Defend and Heal");
                String action = input.nextLine();

                if(action.equals("1"))
                {
                    activePlayer.attack(targetPlayer);
                }
                else if(action.equals("2"))
                {
                    activePlayer.heal();
                }
                else 
                {
                    System.out.println("Invalid Action!");
                }
                isPlayer1Turn = !isPlayer1Turn;
            }

            System.out.println("\n----- MATCH OVER -----");
            if(player1.isAlive())
            {
                System.out.println("VICTORY FOR " + player1.getName()+ "!");
            }
            else
            {
                System.out.println("VICTORY FOR " + player2.getName()+ "!");
            }



            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("\nDo you want to play a rematch? (Y/N): ");
                String answer = input.nextLine().trim().toUpperCase();
                
                if (answer.equals("Y")) {
                    playAgain = true;
                    validChoice = true;
                } else if (answer.equals("N")) {
                    playAgain = false;
                    validChoice = true;
                    System.out.println("Thanks for playing! See you next time.");
                } else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }
        }

        input.close();
    }

    private static Player createPlayer(Scanner input, String playerLabel)
    {
        System.out.println("\n" + playerLabel + " Setup");
        System.out.print("Enter Player's Name: ");
        String name =  input.nextLine();

        System.out.println("Select Your Class:");
        System.out.println("1- Warrior");
        System.out.println("2- Mage");
        String choice = input.nextLine();
        
        if(choice.equals("2"))
        {
            return new Mage(name);
        }
        else
        {
            return new Warrior(name);
        }
    }
}