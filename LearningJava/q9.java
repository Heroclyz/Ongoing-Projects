package LearningJava;

class Animal{
    public void eat()
    {
        System.out.println("Dogs Eat Meat (Generally)");
    }
}
    class Dog extends Animal
    {
        public void friendly()
        {
            System.out.println("Dogs Are Friendly");
        }
    }


public class q9 {
    public static void main(String[] args)
    {
        Dog Alex = new Dog();
        Alex.eat();
        Alex.friendly();
    }
}