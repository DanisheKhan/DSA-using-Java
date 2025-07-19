package FiveString;

import java.util.*;

public class OneStringBasics {

  public static void PrintLetters(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i)+" ");
    }
  }

  public static void main(String[] args) {
    // ! Declaration
    // String arr = "danish";
    // String arrTwo = new String("danish");

    // ! Take Input
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Your name");
    // String name = sc.nextLine();
    // System.out.println("Your name is : " + name);
    // sc.close();

    // ! function that is length()
    // String father = "Naeem Khan";
    // System.out.println(father.length());

    // ! Concatenation
    String firstName = "danish";
    String lastName = "khan";
    String arr = "Danish Khan";

    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    System.out.println(fullName.charAt(0));
    PrintLetters(arr);

  }
}