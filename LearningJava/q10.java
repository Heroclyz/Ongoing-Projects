

/*
package LearningJava;

class Animals
{
    public String name = "Alex";
    public void eat()
    {
        System.out.println(name+" Eats Food");
    }
}
class Dog extends Animals
{
    public void friendly()
    {
        System.out.println(name + " is a Friendly Dog");
    }
    public void displayName()
    {
        System.out.println("My Dogs Name is = " + name);
    }
}


public class q10 {
    public static void main(String[] args)
    {
        Dog alex = new Dog();

        alex.eat();
        alex.friendly();
        alex.displayName();

    }
}
    */
// Sending Data to Class with Scanner-getter-setter commands

package LearningJava;

import java.util.Scanner;

class Animal 
{
    private String name;
    private int age;

    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }

    public void setage(int age)
    {
        this.age = age;
    }
    
    public int getage()
    {
        return age;
    }

}

class Dog extends Animal
{
    public void display()
    {
        System.out.println("My Dogs Name Is = " + getname());
        System.out.println("My Dogs Age Is = " + getage());
    }

    public void bark()
    {
        System.out.println(getname() +" Barks A LOT!");
    }

}

public class q10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Dogs Name:");
        String name = input.nextLine();

        System.out.print("Please Enter Your Dogs Age:");
        int age = input.nextInt();

        Dog dog1 = new Dog();

        dog1.setage(age);
        dog1.setname(name);

        dog1.display();
        dog1.bark();
        input.close();
    }
}