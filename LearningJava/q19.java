package LearningJava;

enum Size1
{
    SMALL, MEDİUM, LARGE, EXTRALARGE
}

class Kebab
{
    Size1 kebabSize;

    public Kebab(Size1 kebabsize)
    {
        this.kebabSize = kebabsize;
    }
}

public class q19 {
    public static void main(String[] args)
    {
        Kebab adana = new Kebab(Size1.EXTRALARGE);
        System.out.println(adana.kebabSize);
    }
}
