package CIE;
import java.util.Scanner;
public class Student
{
   Scanner scan = newScanner(System.in);
   public string usn , name ;
   public int sem;
   public void accept()
{
  
  System.out.println("Enter USN:");
  usn=scan.nextLine();
  System.out.println("Enter Name:");
  name=scan.nextLine();
  System.out.println("Enter Semester:");
  sem=scan.nextInt();
}

 public void display()
{
  System.out.println("Name :" +name);
  System.out.println("USN:"+usn);
  System.out.println("Semester:"+sem);
}
}
  
