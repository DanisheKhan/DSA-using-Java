package BArray;
import java.util.*;

public class OneArr {
  public static void main(String[] args) {

    // ! creating an array
    int marks[] = new int[100];
    int numbers[] = { 12, 44, 4656, 654, 5454 };
    String names[] = { "danish", "khan" };

    // ! input
    int code[] = new int[10];
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("enter first code");
      code[0] = sc.nextInt();
      System.out.println("enter second code");
      code[1] = sc.nextInt();
      System.out.println(" C1 " + code[0] + ", C2 " + code[1]);
    }

    // ! update
    code[0] = 500;
    code[1] = 600;
    System.out.println(" C1 " + code[0] + ", C2 " + code[1]);

    // ! length
    System.out.println("length :" + marks.length);
    System.out.println("length :" + names.length);
    System.out.println("length :" + numbers.length);

  }
}