package GBitwiseOperators;

public class TwoCheckOddAndEven {
  public static void OE(int n) {
    int bitmask = 1;
    if((n&bitmask)==0){
      System.out.println("even number");
    }else{
      System.out.println("odd number");
    }
  }

  public static void main(String[] args) {
    OE(5);
    OE(8);
    OE(13);
    OE(20);
  }
}
