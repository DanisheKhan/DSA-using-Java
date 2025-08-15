package HOOPs;

public class EightHybridInheritance {
  public static void main(String[] args) {
    Puppy p = new Puppy();
    p.eat(); // from Animal interface
    p.play(); // from Pet interface
    p.bark(); // from Dog class
    p.weep(); // from Puppy class
  }
}

// base class
interface Animal {
  void eat();
}

// base class
interface Pet {
  void play();
}

// Dog inherits from Animal and Pet (multiple inheritance via interfaces)
class Dog implements Animal, Pet {
  public void eat() {
    System.out.println("Dog eats");
  }

  
  public void play() {
    System.out.println("Dog plays");
  }

  void bark() {
    System.out.println("Dog barks");
  }
}

// Puppy inherits from Dog (multilevel)
class Puppy extends Dog {
  void weep() {
    System.out.println("Puppy weeps");
  }
}
