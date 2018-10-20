import java.util.Scanner;
public class Banquetes{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int NumPerson;
   int Total;
   System.out.println("Ingresa un numero de personas:");
   NumPerson = input.nextInt();

   if (NumPerson>300){
    Total = NumPerson * 75;
    System.out.println("Total a pagar del banquete: " + Total);
  } else if (NumPerson >200 && NumPerson <=300){
    Total = NumPerson * 85;
    System.out.println("Total a pagar del banquete: " + Total);
  } else{
    Total = NumPerson * 95;
    System.out.println("Total a pagar del banquete: " + Total);
  }
 }
}