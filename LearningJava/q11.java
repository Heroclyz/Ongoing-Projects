package LearningJava;

class Animal{
    public void eat()
    {
        System.out.println("Dogs Eat Meat (Generally)");
    }
}
    class Dog extends Animal
    {
        public void eat()
        {
            super.eat();
            System.out.println("My Dog Eats Beef");
        }
        public void friendly()
        {
            System.out.println("Dogs Are Friendly");
        }
    }


public class q11 {
    public static void main(String[] args)
    {
        Dog Alex = new Dog();
        Alex.eat();
        Alex.friendly();
    }
}