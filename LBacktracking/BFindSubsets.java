package LBacktracking;

public class BFindSubsets {
  public static void FS(String str, String ans, int i) {
    // Base case
    if (i == str.length()) {
      System.out.println(ans);
      return;
    }

    // Yes Choice
    FS(str, ans + str.charAt(i), i + 1);

    // No Choice
    FS(str, ans, i + 1);
  }

  public static void main(String[] args) {
    String str = "abcd";
    FS(str, "", 0);
  }
}
