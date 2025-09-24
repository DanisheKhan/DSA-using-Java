package WTrieDataStructure;

class TrieNode {
  TrieNode[] children = new TrieNode[26];
  boolean isEndOfWord = false;
}

class Trie {
  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  public void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
      int idx = c - 'a';
      if (node.children[idx] == null) {
        node.children[idx] = new TrieNode();
      }
      node = node.children[idx];
    }
    node.isEndOfWord = true;
  }

  public boolean startsWith(String prefix) {
    TrieNode node = root;
    for (char c : prefix.toCharArray()) {
      int idx = c - 'a';
      if (node.children[idx] == null) {
        return false;
      }
      node = node.children[idx];
    }
    return true;
  }
}

public class DStartsWithProblem {
  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("apple");
    trie.insert("app");
    trie.insert("banana");

    System.out.println(trie.startsWith("app")); // true
    System.out.println(trie.startsWith("ban")); // true
    System.out.println(trie.startsWith("bat")); // false
  }
}
