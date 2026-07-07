package Library;
import java.util.Scanner;

class Member
{
    protected String id;
    private String name;
    private String password;

    public Member(String Id, String Name, String Password)
    {
        this.id = Id;
        this.name = Name;
        this.password = Password;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }
    public String getName()
    {
        return name;
    }

    public boolean passVerification(String Password)
    {
        return this.password.equals(Password);
    }
    public void displayInfo()
    {
        System.out.println("Member ID = " + id);
        System.out.println("Member Name = " + name);
        System.out.println("------------------");
    }
}
class Student extends Member
{
    private String no;
    private int bookcount;

    public Student(String id, String name, String password, String no)
    {
        super(id,name,password);
        this.no = no;
        this.bookcount = 0;
    }

    public void borrowBooks()
    {
        if(bookcount < 3)
        {
            bookcount++;
            System.out.println(getName()+" Borrowed a Book ||| Total = " + bookcount);
        }
        else
        {
            System.out.println("Sorry! You Can't Borrow Any Books Because You Already Have the Max Amount!");
        }
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Student No = " + no);
        System.out.println("Borrowed Book Amount = " + bookcount);
        System.out.println("------------------");
    }


}

public class library {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String action = "";
        while(true)
        {
            System.out.println("Press Enter for New Registration, or type 'Close' to close the Registration Menu");
            action = input.nextLine();
            if(action.equalsIgnoreCase("Close"))
            {
                System.out.println("Shutting The System Down!");
                break;
            }

            System.out.println("--- Enter Student Information ---");

            System.out.print("Student ID = ");
            String id = input.nextLine();
            System.out.print("Student Name = ");
            String name = input.nextLine();
            System.out.print("Student's Password = ");
            String pass = input.nextLine();
            System.out.print("Student Number = ");
            String no = input.nextLine();

            Student newStudent = new Student(id,name,pass,no);

            newStudent.displayInfo();

            while (true) {
                System.out.print("\nWould you like to borrow a book? (Yes/No): ");
                String bookAnswer = input.nextLine();

                if (bookAnswer.equalsIgnoreCase("Yes")) {
                    newStudent.borrowBooks();
                } else if (bookAnswer.equalsIgnoreCase("No")) {
                    break;
                } else {
                    System.out.println("Please enter a valid option (Y/N).");
                }
            }
        }
        input.close();
        }
    }

