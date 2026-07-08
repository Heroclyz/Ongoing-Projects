package Library;
import java.util.ArrayList;
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
    public String getId()
    {
        return id;
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
    private int no;
    private int bookcount;

    public Student(String id, String name, String password, int no)
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
        System.out.println("------------------");
        System.out.println("\nStudent No = " + no);
        System.out.println("Borrowed Book Amount = " + bookcount);
        System.out.println("------------------");
    }


}

public class library {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentDataBase = new ArrayList<>();
        String action = "";
        while(true)
        {
            System.out.println("\nSelect an action:");
            System.out.println("1 - Register New Student");
            System.out.println("2 - System Login");
            System.out.println("Type 'Close' to shut down");
            
            action = input.nextLine();
            if(action.equalsIgnoreCase("Close"))
            {
                System.out.println("Shutting The System Down!");
                break;
            }
            else if(action.equals("1")){
            System.out.println("--- Enter Student Information ---");

            System.out.print("Student ID = ");
            String id = input.nextLine();
            System.out.print("Student Name = ");
            String name = input.nextLine();
            System.out.print("Student's Password = ");
            String pass = input.nextLine();
            System.out.print("Student Number = ");
            int no = input.nextInt();
            input.nextLine();
            Student newStudent = new Student(id,name,pass,no);
            studentDataBase.add(newStudent);
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
            else if(action.equals("2"))
            {
                System.out.println("Enter ID = ");
                String loginID = input.nextLine();
                System.out.println("Enter Password");
                String loginPass = input.nextLine();

                Student loginStudent = null;


                for(Student student : studentDataBase)
                {
                    if(student.getId().equals(loginID) && student.passVerification(loginPass))
                    {
                        loginStudent = student;
                        break;
                    }
                }
            
            if(loginStudent != null)
            {
                System.out.println("Login Succesfull!");
                loginStudent.displayInfo();
            
            while (true) {
                System.out.print("\nWould you like to borrow a book? (Yes/No): ");
                String bookAnswer = input.nextLine();

                if (bookAnswer.equalsIgnoreCase("Yes")) {
                    loginStudent.borrowBooks();
                } else if (bookAnswer.equalsIgnoreCase("No")) {
                    break;
                } else {
                    System.out.println("Please enter a valid option (Y/N).");
                }
            }
        }
        else {
            System.out.println("Login Failed! Incorrect ID or Password!");
        }
        }
        else {
            System.out.println("Invalid Action! Select 1-2 or Type Close Please!");
        }
        }
        input.close();
    }
    
}

