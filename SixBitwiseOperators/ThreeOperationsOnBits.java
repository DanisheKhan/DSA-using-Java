package SixBitwiseOperators;

public class ThreeOperationsOnBits {

  public static int getIthBit(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int setIthBit(int n, int i) {
    int bisMask = 1 << i;
    return n | bisMask;
  }

  public static int clearIthBit(int n, int i) {
    int bisMask = ~(1 << i);
    return n & bisMask;
  }

  public static int updateIthBit(int n, int i,int newBit) {
    if(newBit ==0){
      return clearIthBit(n, i);
    }else{
      return setIthBit(n, i);
    }
  }

  public static void main(String[] args) {
    System.out.println(getIthBit(10, 3));
    System.out.println(setIthBit(10, 2));
    System.out.println(clearIthBit(10, 1));

  }
}
