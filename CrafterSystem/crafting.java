

// i will add a better inv system this week!

package CrafterSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
class Ingredient {
    public String Name;
    public int amt;

    public Ingredient(String n, int a) {
        Name = n;
        amt = a;
    }
}

class Recipe {
    public String resultItem;
    public int resultQuantity;
    public ArrayList<Ingredient> reqs;

    public Recipe(String r, int q) {
        resultItem = r;
        resultQuantity = q;
        reqs = new ArrayList<Ingredient>();
    }

    public void addReq(String n, int q) {
        Ingredient i = new Ingredient(n, q);
        reqs.add(i);
    }

    public void show() {
        System.out.print(resultQuantity + "x " + resultItem + " requires: ");
        for (int i = 0; i < reqs.size(); i++) {
            System.out.print(reqs.get(i).amt + "x " + reqs.get(i).Name);
            if (i != reqs.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}

class Inventory {
    public HashMap<String, Integer> itemsList;

    public Inventory() {
        itemsList = new HashMap<String, Integer>();
    }

    public void add(String n, int q) {
        if (itemsList.containsKey(n) == true) {
            int old = itemsList.get(n);
            itemsList.put(n, old + q);
        } else {
            itemsList.put(n, q);
        }
    }

    public void remove(String n, int q) {
        if (itemsList.containsKey(n) == true) {
            int old = itemsList.get(n);
            if (old <= q) {
                itemsList.remove(n);
            } else {
                itemsList.put(n, old - q);
            }
        }
    }

    public boolean checkEnoug(String n, int q) {
        if (itemsList.containsKey(n) == true) {
            if (itemsList.get(n) >= q) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("\n--- YOUR INVENTORY ---");
        if (itemsList.size() == 0) {
            System.out.println("Inventory is empty.");
        } else {
            for (String key : itemsList.keySet()) {
                System.out.println("- " + key + ": " + itemsList.get(key));
            }
        }
        System.out.println("----------------------\n");
    }
}

public class crafting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory myInv = new Inventory();
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();

        Recipe r1 = new Recipe("Sword", 1);
        r1.addReq("Wood", 1);
        r1.addReq("Iron", 2);
        recipes.add(r1);

        Recipe r2 = new Recipe("Shield", 1);
        r2.addReq("Wood", 4);
        r2.addReq("Iron", 1);
        recipes.add(r2);

        Recipe r3 = new Recipe("Axe", 1);
        r3.addReq("Wood", 2);
        r3.addReq("Iron", 3);
        recipes.add(r3);

        myInv.add("Wood", 10);
        myInv.add("Iron", 5);

        boolean running = true;

        while (running == true) {
            System.out.println("1- View Inventory");
            System.out.println("2- View Recipe Book");
            System.out.println("3- Craft an Item");
            System.out.println("4- Quit");
            System.out.print("Your choice: ");
            
            String c = input.nextLine();

            if (c.equals("1") == true) {
                myInv.print();
            } else if (c.equals("2") == true) {
                System.out.println("\n--- RECIPE BOOK ---");
                for (int i = 0; i < recipes.size(); i++) {
                    recipes.get(i).show();
                }
                System.out.println("-------------------\n");
            } else if (c.equals("3") == true) {
                System.out.print("Enter the name of the item you want to craft: ");
                String itemToCraft = input.nextLine();
                
                Recipe foundRecipe = null;
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).resultItem.toLowerCase().equals(itemToCraft.toLowerCase()) == true) {
                        foundRecipe = recipes.get(i);
                    }
                }

                if (foundRecipe == null) {
                    System.out.println("Recipe not found!");
                } else {
                    boolean canMake = true;
                    for (int i = 0; i < foundRecipe.reqs.size(); i++) {
                        boolean has = myInv.checkEnoug(foundRecipe.reqs.get(i).Name, foundRecipe.reqs.get(i).amt);
                        if (has == false) {
                            canMake = false;
                            System.out.println("Not enough " + foundRecipe.reqs.get(i).Name + "!");
                        }
                    }

                    if (canMake == true) {
                        for (int i = 0; i < foundRecipe.reqs.size(); i++) {
                            myInv.remove(foundRecipe.reqs.get(i).Name, foundRecipe.reqs.get(i).amt);
                        }
                        myInv.add(foundRecipe.resultItem, foundRecipe.resultQuantity);
                        System.out.println("Successfully crafted!");
                    }
                }
            } else if (c.equals("4") == true) {
                System.out.println("Shutting down...!");
                running = false;
            } else {
                System.out.println("Invalid input!");
            }
        }
        input.close();
    }
}
