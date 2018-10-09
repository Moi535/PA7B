import javax.swing.JOptionPane;
public class DoWhileLoop{
  public static void main(String[] args) {
    int data;
    int sum = 0;

    do{
      data =
      Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an value the program exist if the input is 0"));
      sum += data;
    }while(data != 0);
  }
}
