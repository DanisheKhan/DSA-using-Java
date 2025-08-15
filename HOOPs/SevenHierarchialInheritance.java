package HOOPs;

public class SevenHierarchialInheritance {
  public static void main(String[] args) {
    Cat c = new Cat();
    c.eat();
    c.meow();

    Dog d = new Dog();
    d.eat();
    d.bark();
  }
}

// Base class
class Animal {
  void eat() {
    System.out.println("Animal eats");
  }
}

// Derived class 1
class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks");
  }
}

// Derived class 2
class Cat extends Animal {
  void meow() {
    System.out.println("Cat meows");
  }
}