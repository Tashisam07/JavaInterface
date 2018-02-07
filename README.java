# JavaInterface
//this is an implementation of java interface
import java.util.*;
import java.Lang.*;
import java.util.Scanner;

interface StudentDetails{
    void info();
    void showDetails();
}
interface StudentMarks{
    void marks();
}
class Student implements StudentDetails{
    Scanner sc=new Scanner(System.in);
    String name,section;
    int rollno;
    public void info(){
        System.out.println("Enter your name: ");
        name =sc.nextLine();
        System.out.println("Enter your roll no: ");
        rollno=sc.nextInt();
        System.out.println("Enter Section: ");
        section=sc.next();
    }
    public void showDetails(){
        System.out.println("Your Name: "+name+"\nYour RollNo: "+rollno+"\nSection: "+section);
    }
}
class Marks implements StudentMarks{
    Scanner a=new Scanner(System.in);
    double mathMarks,javaMarks,eleMarks;
    double overall;
    double percent;
    public void marks(){
        System.out.println("give me your Mathematics Marks");
        mathMarks=a.nextInt();
        System.out.println("give me your java OOP marks");
        javaMarks=a.nextInt();
        System.out.println("Give me your Electronics marks");
        eleMarks=a.nextInt();
        System.out.println("Your Maths Marks: "+mathMarks);
        System.out.println("Your java OOP marks: "+javaMarks);
        System.out.println("Your Electronics marks: "+eleMarks);
        System.out.println("Your overall marks: ");
        overall=mathMarks+javaMarks+eleMarks;
        System.out.println("You got "+overall+" out of 300");
        System.out.print("Your Percentage is: ");
        percent=(overall/300)*100;
        System.out.println(percent);
        
}
}
public class InterfaceTest1{
    public static void main(String args[]){
        int ch=0;
        do{
        Scanner in=new Scanner(System.in);
        Student obj1=new Student();
        Marks obj2=new Marks();
        int choice;    
        System.out.println("Student Login!!!");
        System.out.println("1.Student Detail\n2.Student CIA Marks\n3.Result\nEnter your choice");
        choice= in.nextInt();
        switch(choice){
            case 1: obj1.info();
                    obj1.showDetails();
                    break;
            case 2: obj2.marks();
                    break;
            default:System.out.println("WRONG OPTION");
                    break;
        }
        System.out.println("Home(1/0)");
        ch=in.nextInt();
        }
        while(ch==1);
    }
        
}
