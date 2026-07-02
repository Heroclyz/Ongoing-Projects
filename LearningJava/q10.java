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
