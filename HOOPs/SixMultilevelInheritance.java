package HOOPs;

public class SixMultilevelInheritance {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    d.bark();
    d.displayBreed();
  }
}

// Base class
class Animal {
  void eat() {
    System.out.println("Animal eats");
  }
}

// Derived class from Animal
class Mammal extends Animal {
  void bark() {
    System.out.println("Mammal barks");
  }
}

// Derived class from Mammal (multilevel)
class Dog extends Mammal {
  void displayBreed() {
    System.out.println("Dog is a breed of mammal");
  }
} 