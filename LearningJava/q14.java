package LearningJava;

import java.util.Scanner;

interface Lang {
    void getName(String name);
}

class ProgrammingLanguage implements Lang
{
    public void getName(String name)
    {
        System.out.println("The Programming Language You Have Been Using is " + name);
    }
}

public class q14 {
    public static void main(String[] args)
    {
        System.out.print("Enter the Programming Language You Are Using:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        ProgrammingLanguage prog = new ProgrammingLanguage();
        prog.getName(name);

        input.close();
    }
}
