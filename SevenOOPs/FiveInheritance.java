package SevenOOPs;

public class FiveInheritance {
  public static void main(String[] args) {
    
    Fish shark= new Fish();
    
  }
}

// Base Class or Parent Class
class Animal{
  String color;

  void eat(){
    System.out.println("fish eats");
  }
  void breath(){
    System.out.println("fish breaths");
  }
}

// Derived Class or Child Class
class Fish extends Animal{
  int fins;

  void swim(){
    System.out.println("swims");
  }
}
