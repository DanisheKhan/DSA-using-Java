package QQueue;

import java.util.*;

public class FFirstNonRepeatingLetterInAStreamOfCharacters {
  public static void main(String[] args) {
    String stream = "aabc";
    String result = firstNonRepeating(stream);
    System.out.println(result);
  }

  public static String firstNonRepeating(String stream) {
    Queue<Character> q = new LinkedList<>();
    int[] freq = new int[26];
    StringBuilder result = new StringBuilder();

    for (char ch : stream.toCharArray()) {
      freq[ch - 'a']++;
      q.add(ch);

      while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
        q.poll();
      }

      if (q.isEmpty()) {
        result.append('#');
      } else {
        result.append(q.peek());
      }
    }
    return result.toString();
  }
}