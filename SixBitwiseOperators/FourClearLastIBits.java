package SixBitwiseOperators;


public class FourClearLastIBits {

  public static int CB(int n, int i){
    int bitMask=(~0)<<i;
    return n&bitMask;
  }
  public static void main(String[] args) {
    System.out.println(CB(15, 2));
  }
}
