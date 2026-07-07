package LearningJava;

class ProgLanguage 
{
    public void displayInfo()
    {
        System.out.println("Language");
    }
}
class Java extends ProgLanguage
{
    public void displayInfo()
    {
        System.out.println("Python");
    }
}
public class q15
{
    public static void main(String[] args)
    {
        ProgLanguage prog = new ProgLanguage();
        prog.displayInfo();

        Java java = new Java();
        java.displayInfo();
    }
}