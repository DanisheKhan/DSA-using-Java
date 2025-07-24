package SixBitwiseOperators;

public class SixIsPowerOfTwo {
  public static boolean PT(int n) {
    return (n & (n - 1)) == 0;
  }

  public static void main(String[] args) {
    System.out.println(PT(8));   
    System.out.println(PT(10));  
    System.out.println(PT(1));   
    System.out.println(PT(0));  
  } 
}
