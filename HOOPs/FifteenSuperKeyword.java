package HOOPs;

public class FifteenSuperKeyword {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.printColor();
  }
}

class Animal {
  String color = "brown";
}

class Dog extends Animal {
  String color = "black";

  void printColor() {
    System.out.println("Dog color: " + color); // black (current class)
    System.out.println("Animal color: " + super.color); // brown (parent class)
  }
}