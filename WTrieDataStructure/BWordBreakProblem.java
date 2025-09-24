package WTrieDataStructure;

class TrieNode {
  TrieNode[] children = new TrieNode[26];
  boolean isEndOfWord;
}

class Trie {
  TrieNode root = new TrieNode();

  void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
      int idx = c - 'a';
      if (node.children[idx] == null)
        node.children[idx] = new TrieNode();
      node = node.children[idx];
    }
    node.isEndOfWord = true;
  }
}

public class BWordBreakProblem {
  public static void main(String[] args) {
    String[] dict = { "leet", "code" };
    String s = "leetcode";
    Trie trie = new Trie();
    for (String word : dict) {
      trie.insert(word);
    }
    System.out.println(wordBreak(s, trie.root, 0));
  }

  static boolean wordBreak(String s, TrieNode root, int start) {
    TrieNode node = root;
    for (int i = start; i < s.length(); i++) {
      int idx = s.charAt(i) - 'a';
      if (node.children[idx] == null)
        return false;
      node = node.children[idx];
      if (node.isEndOfWord) {
        if (i == s.length() - 1 || wordBreak(s, root, i + 1))
          return true;
      }
    }
    return false;
  }
}
