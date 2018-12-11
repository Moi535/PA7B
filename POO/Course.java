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
    for (int i=0; i <= this.Students.lenght-1; i++ ) {
      this.students[i]=null;
    }else{

    }
  }
  public String[] getStudents(){
  return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudents;
  }
}
