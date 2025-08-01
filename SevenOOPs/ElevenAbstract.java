package SevenOOPs;

public class ElevenAbstract {
  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.eat();
    horse.walk();

    Chicken chicken = new Chicken();
    // Animal obj = new Animal(); // This will cause a compilation error because
    // Animal is abstract
  }
}


abstract class Animal {
  Animal() {
    System.out.println("Animal constructor called");
  }
  void eat(){
    System.out.println("animals eats");

  }

  abstract void walk();
  
}

class Horse extends Animal{
  Horse() {
    System.out.println("Horse constructor called");
  }
  void walk(){
    System.out.println("walks on four legs");
  }
}

class Chicken extends Animal{
  Chicken() {
    System.out.println("Chicken constructor called");
  }
  void walk(){
    System.out.println("Chicken walks on 3 legs");
  }
}