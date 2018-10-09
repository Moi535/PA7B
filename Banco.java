import java.util.Scanner;
public class banco {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double AC;

    System.out.println("Teclear el tipo de tarjeta: ");
    int TT = input.nextInt();
    System.out.println("Teclear el Credito actual limitado: ");
    double LA = input.nextDouble();

    if (TT == 1)
    AC = LA * 0.25;
    else if (TT == 2)
    AC = LA * 0.35;
  }
}
