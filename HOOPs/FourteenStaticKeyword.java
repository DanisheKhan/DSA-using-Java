package HOOPs;

public class FourteenStaticKeyword {
  public static void main(String[] args) {
    TalibeIlm sOne = new TalibeIlm();
    TalibeIlm.schoolName = "BZ"; // Set static variable using class name

    TalibeIlm sTwo = new TalibeIlm();
    System.out.println(TalibeIlm.schoolName); // Access static variable using class name
  }
}

class TalibeIlm {
  String name;
  int roll;

  static String schoolName;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
}