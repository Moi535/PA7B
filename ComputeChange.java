import java.util.Scanner;

public class ComputeChange{
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    System.out.println("Enter an amount in double: ");
    double amount = input.nextDouble();

    int cents = (int)(amount * 100);

    //Find the number of Dollars
    int numberOfDollars = cents /100;
    cents = cents % 100;

    //find the quarters
    int numberOfQuarters = cents /25;
    cents = cents % 25;

    //numberOfDimes
    int numberOfDimes = cents /10;
    cents = cents % 10;

    //number Of nickels
    int numberOfNickels = cents /5;
    cents = cents % 5;

    //numberOfPennies
    int numberOfPennies = cents;

    System.out.println("Your amount" + amount +"consists of \n" + "\t" + numberOfDollars + "dollars" + )
  }
}
