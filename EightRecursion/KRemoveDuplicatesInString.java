package EightRecursion;

public class KRemoveDuplicatesInString {

  public static void DR(String str, int idx, StringBuilder newStr, boolean map[]) {
    if(idx ==str.length()){
      System.out.println(newStr);
      return;
    }
    char currChar = str.charAt(idx);
    if (!map[currChar - 'a']) {
      map[currChar - 'a'] = true;
      DR(str, idx + 1, newStr.append(currChar), map);
      newStr.deleteCharAt(newStr.length() - 1); // backtrack
    } else {
      DR(str, idx + 1, newStr, map);
    }
  }
  public static void main(String[] args) {
    String str = "abbccdaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    boolean[] map = new boolean[26];
    DR(str, 0, new StringBuilder(), map);
  }

}
