import javax.swing.JOptionPane;
public class DogImplement{
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.color = "black";
    fido.eyeColor = "blue";
    fido.height = 0.50d;
    fido.lenght = 30.0d;

    Dog chilaquil = new Dog();
    chilaquil.color = "brown";
    chilaquil.eyeColor = "green";
    chilaquil.height = 0.78d;
    chilaquil.weight = 25.0d;

    JOptionPane.showMessageDialog(null,"FIDO es de color: " + fido.color);

    JOptionPane.showMessageDialog(null,"Chilaquil es de color: " + chilaquil.color);

    fido.sit();
    fido.layDown("my name is FIDO");
    fido.sleep();
  }
}
