import java.util.Scanner;
public class AlmacenPromocion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Double Descuento, PrecioFin ;

    System.out.println("Ingresa el costo del traje: ");
    Double Costo = input.nextDouble();

    if (Costo >= 2500){
	Descuento = (Costo * 15) / 100;
	PrecioFin = Costo - Descuento;
	System.out.println("El precio final del traje es: " + PrecioFin);
    }else {
	Descuento = (Costo * 8) / 100;
	PrecioFin = Costo - Descuento;
	System.out.println("El precio final del traje es: " + PrecioFin);
    }
  }
}