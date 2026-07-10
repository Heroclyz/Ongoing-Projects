package LearningJava;

class Room
{
    private int longside;
    private int shortside;

    public Room(int longside , int shortside)
    {
        this.longside = longside;
        this.shortside = shortside;
    }

    public void displayInfo()
    {
        System.out.println("Area = " + (longside*shortside));
    }
}


public class q17 {
    public static void main(String[] args)
    {
        int longi = 5;
        int shorti = 4;

        Room area1 = new Room(longi,shorti);

        area1.displayInfo();
    }
}
