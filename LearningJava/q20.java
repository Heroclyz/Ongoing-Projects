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

        String lang = languages.get(4);

        System.out.println(lang);
        System.out.println(languages + " ");
    }
}
