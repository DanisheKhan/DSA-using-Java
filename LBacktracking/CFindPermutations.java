package LBacktracking;

public class CFindPermutations {
  static void findPermutations(String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char current = str.charAt(i);
      String left = str.substring(0, i);
      String right = str.substring(i + 1);
      String string = left + right;
      findPermutations(string, ans + current);
    }
  }

  public static void main(String[] args) {
    String str = "abc";
    findPermutations(str, "");
  }

}
