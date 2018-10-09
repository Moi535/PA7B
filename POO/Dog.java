public class Dog{
  //Properities or attributes
  public String color;
  public String eyeColor;
  public Double height;
  public Double lenght;
  public Double weight;

  //Methods o behaviors
  public String sit(){
    return "Estoy setado";
    //System.out.println("Estoy sentado");
  }

  public void bark(){
    System.out.println("wauff wauff wauff");
  }

  public void layDown(String datos){
    System.out.println("Estoy recostado");
  }

  public void eat(){
    System.out.println("Estoy comiendo");
  }

  public void sleep(){
    System.out.println("ZZZzzzzZZZzzz");
  }
}
