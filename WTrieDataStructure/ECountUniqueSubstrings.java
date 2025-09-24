package WTrieDataStructure;

class TrieNode {
  TrieNode[] children = new TrieNode[26];
}

public class ECountUniqueSubstrings {
  public static void main(String[] args) {
    String s = "ababa";
    System.out.println("Unique substrings: " + countUniqueSubstrings(s));
  }

  public static int countUniqueSubstrings(String s) {
    TrieNode root = new TrieNode();
    int count = 0; 
    for (int i = 0; i < s.length(); i++) {
      TrieNode node = root;
      for (int j = i; j < s.length(); j++) {
        int idx = s.charAt(j) - 'a';
        if (node.children[idx] == null) {
          node.children[idx] = new TrieNode();
          count++;
        }
        node = node.children[idx];
      }
    }
    return count; // Only non-empty substrings
  }
}
