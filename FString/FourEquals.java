package FString;

public class FourEquals {
  public static void main(String[] args) {
    String a = "danishKhan";
    String b = "danishKhan";
    String c = new String("danishKhan");

    // System.out.println("a == b: " + (a == b));
    // System.out.println("a == c: " + (a == c));
    // System.out.println("b == c: " + (b == c));

    // ! equals function
    // System.out.println("a.equals(b): " + a.equals(b));
    // System.out.println("a.equals(c): " + a.equals(c));
    // System.out.println("b.equals(c): " + b.equals(c));

    // ! Substring
    String substrings = a.substring(0, 6);
    System.out.println(substrings);
  }
}
