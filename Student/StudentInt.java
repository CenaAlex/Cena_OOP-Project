package Student;
import java.util.Scanner;

class StudentInt{
   public static void main(String a[]){
   
   Scanner scan = new Scanner(System.in);
   Student stud = new Student();
   
   System.out.print("Enter First Name: ");
   stud.setFName(scan.nextLine());
   
   System.out.print("Enter Middle Name: ");
   stud.setMidName(scan.nextLine());
   
   System.out.print("Enter Last Name: ");
   stud.setLName(scan.nextLine());
   
   
   System.out.print("Enter Suffix: ");
   stud.setSuffix(scan.nextLine());
   
   
   System.out.println("First Name: " + stud.getFName());
   
   System.out.println("Middle Name: " + stud.getMidName());
   
   System.out.println("Last Name: " + stud.getLName());
   
   System.out.println("Suffix : " + stud.getSuffix());
   
   System.out.println("Full Name: "+ stud.getFullName());
   
   
   
   }
}