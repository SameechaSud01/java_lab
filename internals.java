package CIE;
import java.util.Scanner;
public class internals extends CIE.student
 {
  Scanner scan= new Scanner (System.in);

  public int ciem[]= new int[5];

  public void accept(){
   
  for(int i=0; i<5; i++)
  {
  System.out.println("Enter the cie marks of subjects" +(i+1));
  ciem[i]=scan.nextInt();
}
}