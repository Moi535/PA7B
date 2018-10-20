    public class Course{
      private String courseName;
      private String[] students = new String[100];
      private int numberOfStudents = 0;
// Se implementa manualmente o se crea uno automaticamente por el programa
      public Course(){

      }
      public Course(String CourseName){
        this.courseName = CourseName;
      }

      public String getCourseName() {
        return this.courseName;
  }
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  public void addStudent(String student) {
    this.students[numberOfStudents] = student;
    this.numberOfStudents ++;
  }
  public void dropStudent(String student){
    
  }
  public String[] getStudents(){
  return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudents;
  }
}
