package LearningJava;

abstract class Language
{
    public void display()
    {
        System.out.println("Java is a Programming Language");
    }
}

public class q12 extends Language{
    public static void main(String[] args)
    {
        q12 object = new q12();

        object.display();

    }
}
