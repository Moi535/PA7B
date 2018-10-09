import java.util.Scanner;
public class AreaRectangulo {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Introduce base del rectangulo: ");
    double base = input.nextDouble();

    System.out.println("Introduce altura del rectangulo: ");
    double altura = input.nextDouble();

    double area = base * altura;

    System.out.println("The result is: " +area);
  }
}
