package FitnessTracker;

import java.util.Scanner;
import java.util.ArrayList;


class Nutrition
{
    private int targetCalories, targetProtein, targetCarbs, targetFats, targetWater;
    private int currentCalories, currentProtein, currentCarbs, currentFats, currentWater;

    public Nutrition(int calories, int protein, int carbs, int fat, int water)
    {
        this.targetCalories = calories;
        this.targetCarbs = carbs;
        this.targetFats = fat;
        this.targetProtein = protein;
        this.targetWater = water;


        this.currentCalories = 0;
        this.currentCarbs = 0;
        this.currentFats = 0;
        this.currentProtein = 0;
        this.currentWater = 0;
    }

    public void addFood(int cal, int pro, int carb, int fat)
    {
        currentCalories += cal;
        currentCarbs += carb;
        currentFats += fat;
        currentProtein += pro;
        System.out.println("Meal succesfully added!");
    }

    public void addWater(int water)
    {
        currentWater += water;
        System.out.println(water +" ml Water succesfully added!");
        System.out.println("Current Water = " + currentWater);
    }

    public void displayInfo()
    {
        System.out.println("\n---- Daily Nutrition and Water Status ----");
        System.out.println("Current Carb = " + currentCarbs + "/ Target Carb = " + targetCarbs);
        System.out.println("Current Protein = " + currentProtein + "/ Target Protein = " + targetProtein);
        System.out.println("Current Fats = " + currentFats + "/ Target Fats = " + targetFats);
        System.out.println("Current Calories = " + currentCalories + "/ Target Calories = " + targetCalories);
        System.out.println("Current Water = " + currentWater + "/ Target Water = " + targetWater);
        System.out.println("------------------------------------------------");
    }
}

class WorkoutDays
{
    private String dayName;
    private String targetMuscles;
    private boolean isCompleted;

    public WorkoutDays(String dayname, String targetMuscle)
    {
        this.dayName = dayname;
        this.targetMuscles = targetMuscle;
        this.isCompleted = false;
    }


    public String getName()
    {
        return dayName;
    }
    public String getTargetMuscles()
    {
        return targetMuscles;
    }
    public boolean isComplete()
    {
        return isCompleted;
    }

    public void completeWorkout()
    {
        this.isCompleted = true;
        System.out.println("Congrats! You Completed the " + targetMuscles + " Training!");
    }

}


class Users
{
    private String name;
    private int age;
    private Nutrition nutritionlist;
    private ArrayList<WorkoutDays> routine;
    private int currentDayIndex;


    public Users(String name, int age, Nutrition nutritions)
    {
        // i will use the name and age tomorrow!
        this.name = name;
        this.age = age;
        this.nutritionlist = nutritions;
        this.routine = new ArrayList<>();
        this.currentDayIndex = 0;
        setupArnoldSplit();
    }
    private void setupArnoldSplit()
    {
        routine.add(new WorkoutDays("-Monday-", "Chest & Back"));
        routine.add(new WorkoutDays("-Tuesday-", "Shoulders & Arm"));
        routine.add(new WorkoutDays("-Wednesday-", "Legs & Abs"));
        routine.add(new WorkoutDays("-Thursday-", "Chest & Back"));
        routine.add(new WorkoutDays("-Friday-", "Shoulders & Arm"));
        routine.add(new WorkoutDays("-Saturday-", "Legs & Abs"));
    }
    public Nutrition geNutrition()
    {
        return nutritionlist;
    }
    public void showTodaysWorkout()
    {
        WorkoutDays today = routine.get(currentDayIndex);
        System.out.println("Day Name = " + today.getName());
        System.out.println("Target Muscles = " + today.getTargetMuscles());
        System.out.print("Current Situation = ");
        if(today.isComplete())
        {
            System.out.println("You did the Workout!");
        }
        else {
            System.out.println("You Didn't do The Workout");
        }
    }
    public void finishTodaysWorkout() {
        WorkoutDays today = routine.get(currentDayIndex);
        if (!today.isComplete()) {
            today.completeWorkout();
        } else {
            System.out.println("Good! you are Ambitious! but You Already Completed Today's Workout! go Home and Rest!");
        }
    }
    public void goToNextDay()
    {
        currentDayIndex++;
        if(currentDayIndex >= routine.size())
        {
            currentDayIndex = 0;
        }
        System.out.println("Advancing to the Next Day! Your Next Workout is " + routine.get(currentDayIndex).getTargetMuscles());
    }
}

public class fitnesstracking {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("---------- Welcome to The Fitness Tracking App! ----------");

        Nutrition myNutrition = new Nutrition(2900,170,300,60, 6500);
        Users myUser = new Users("Ege Oner", 19, myNutrition);
        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("1- See Today's Workout Schedule");
            System.out.println("2- Complete the Workout");
            System.out.println("3- Add Meals");
            System.out.println("4- Add Water");
            System.out.println("5- See the Report for Today");
            System.out.println("6- End the Day and Advance to Tomorrow");
            System.out.println("7- Quit");
            System.out.print("Your Choice is = ");
            String choice = input.next();

            if(choice.equals("1"))
            {
                myUser.showTodaysWorkout();
            }
            else if(choice.equals("2"))
            {
                myUser.finishTodaysWorkout();
            }
            else if(choice.equals("3"))
            {
                System.out.print("Calories: ");
                int cal = input.nextInt();
                System.out.print("Protein: ");
                int pro = input.nextInt();
                System.out.print("Carbs: ");
                int carb = input.nextInt();
                System.out.print("Fats");
                int fat = input.nextInt();

                myUser.geNutrition().addFood(cal, pro, carb, fat);
            }
            else if(choice.equals("4"))
            {
                System.out.print("Water: ");
                int water = input.nextInt();
                myUser.geNutrition().addWater(water);
            }
            else if(choice.equals("5"))
            {
                myUser.geNutrition().displayInfo();
            }
            else if(choice.equals("6"))
            {
                // will add resetting the nutritions tomorrow!
                myUser.goToNextDay();
            }
            else if(choice.equals("7"))
            {
                System.out.println("Program Shutting Down!");
                isRunning = false;
            }
            else 
            {
                System.out.println("Wrong Input! please type between (1-7)");
            }

        }

        input.close();

    }
}
