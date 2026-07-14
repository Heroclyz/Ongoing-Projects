package LearningJava;

import java.util.ArrayList;
import java.util.Comparator;

public class q21 {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(5);
        numbers.add(10);
        numbers.add(8);
        numbers.add(12);
        numbers.add(25);



        int size = numbers.size();

        System.out.println("Size = " + size);

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers + " ");
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers + " ");



        ArrayList<Integer> clonedNumbers = (ArrayList<Integer>)numbers.clone();

        System.out.println(clonedNumbers);


    }
}
