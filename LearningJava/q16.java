package LearningJava;

class Programming
{
    public void display()
    {
        System.out.println("Programming Language");
    }
}
class java1 extends Programming
{
    public void display()
    {
        System.out.println("Java Programming Language");
    }
}


public class q16{
    public static void main(String[] args)
    {
        Programming lg;
        lg = new Programming();
        lg.display();
        lg = new java1();
        lg.display();
    }
}