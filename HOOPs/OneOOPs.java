package HOOPs;

// Main class to run the program
public class OneOOPs {
  public static void main(String[] args) {

    Pen p1 = new Pen();
    p1.setColor("Red");
    System.out.println(p1.getColor());
    p1.setTip(4);
    System.out.println(p1.getTip());

    BankAccount myAcc = new BankAccount();
    myAcc.username = "danishkhan";
    // myAcc.password = "khan";
    myAcc.setPassword("danishKhan");

  }
}

class BankAccount {
  public String username;
  private String password;

  public void setPassword(String pwd) {
    password = pwd;
  }
}

class Pen {
  private String color;
  private int tip;

  String getColor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }

  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}