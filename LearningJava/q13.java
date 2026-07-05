package LearningJava;

interface area
{
    void CalculateArea(int s, int l);
}

class Home implements area
{
    public void CalculateArea(int s, int l)
    {
        double area = s*l;
        System.out.println("-> " + area);
    }
}
public class q13
{
    public static void main(String[] args)
    {
        Home home1 = new Home();
        home1.CalculateArea(3, 4);
    }
}