import java.util.Scanner;

public class Student {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("Student Management System");
    System.out.println("1.Add Student ");
    System.out.println("2.Delete Student ");
    System.out.println("3.Udate all Student");
    System.out.println("4.Display all Student");
    System.out.println("5.exit");
    System.out.println("Enter your choice:");
    
    
    int choice =sc.nextInt();
    switch(choice){
     case 1:System.out.println("add Student() ");break;
     case 2:System.out.println("delete Student() ");break;
     case 3:System.out.println("update Student() ");break;
     case 4:System.out.println("display Student() ");break;
     
     case 5: return ;
     default: System.out.println("Invalid choice");
    }
  }




   }
}