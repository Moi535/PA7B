import javax.swing.*;
  public class CourseImpl{
    public static void main(String[] args) {

      int opc = 0;
      do {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige la opción que desea hacer: "));
        switch (opc){
          case 1:
          opc = JOptionPane.showMessageDialog("");
          //crear curso
          break;
          case 2:
          //agregar estudiante
          break;
          case 3:
          //eliminar estudiante
          break;
          case 4:
          //mostrar estudiantes
          break;
          case 5:
          //mostrar numero de estudiantes
          break;
      } while (opc = 0);


      Course curso1 = new Course();
      //curso1.CourseName = "Ingles";
      curso1.setCourseName("Ingles");

      curso1.addStudent("Luis");
      curso1.addStudent("Alndra");
      curso1.addStudent("Manuela");

      String[] studentsDeIngles = curso1.getStudents();
      String students = "";
      for (int i = 0; i < curso1.getNumberOfStudents(); i++){
        students += studentsDeIngles[i] + "\n";
      }
      JOptionPane.showMessageDialog(null, students);


      JOptionPane.showInputDialog(null, "Ingresa el valor a borrar");
      Course curso2 = new Course();
      curso2.setCourseName ("Mate");

      curso2.addStudent("Israel");
      curso2.addStudent("Angel");
      curso2.addStudent("Yo");

      JOptionPane.showMessageDialog(null, curso1.getCourseName());
      //JOptionPane.showMessageDialog(null, curso1.getStudents());
      JOptionPane.showMessageDialog(null, curso2.getCourseName());

      Course curso3 = new Course("Programacion");
      curso3.addStudent("Agustin");
      curso3.addStudent("Carlos");
      curso3.addStudent("Juan");
  }
}
