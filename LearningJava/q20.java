package LearningJava;

import java.util.ArrayList;

public class q20 {
    public static void main(String[] args)
    {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("C");
        languages.add("Java");
        languages.add("C#");
        languages.add("JavaScript");
        languages.add("Python");

        System.out.println(languages + " ");
        String lang = languages.get(4);
        languages.set(1,"Go");
        System.out.println(lang);
        System.out.println(languages + " ");

        String language1 = languages.get(1);
        System.out.println(language1);


        languages.remove(2);

        System.out.println(languages + " ");



        System.out.println("Printing The Info with ForEach");

        for (String language : languages) {
            System.out.print(language + " ");
        }
    }
}
