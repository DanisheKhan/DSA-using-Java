package SevenOOPs;

public class TenPolymorphismMethodOverriding {
  public static void main(String[] args) {
    Deer d = new Deer();
    d.eat();
  }
}

class BaseAnimal {
  void eat() {
    System.out.println("eats anything");
  }
}

class Deer extends BaseAnimal {
  void eat() {
    System.out.println("eats grass");
  }
}