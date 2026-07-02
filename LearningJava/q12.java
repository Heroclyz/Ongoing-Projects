
/* 

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
*/

//Abstract Class - Method --> Learning More


package LearningJava;


abstract class Animal12
{
    abstract void makeSound();

    public void eat()
    {
        System.out.println("All Animals Eat Food");
    }

}

class Dog12 extends Animal12
{
    public void makeSound()
    {
        System.out.println("Dogs Bark!");
    }
}
class Cat extends Animal12
{
    public void makeSound()
    {
        System.out.println("Cats Meow");
    }
}

public class q12
{
    public static void main(String[] args)
    {
        Dog12 dog = new Dog12();
        Cat cat = new Cat();

        dog.makeSound();
        dog.eat();
        System.out.println("----------------------");
        cat.makeSound();
        cat.eat();
    }
}