package WTrieDataStructure;

class TrieNode {
  TrieNode[] children = new TrieNode[26];
  boolean isEndOfWord;
  int prefixCount;

  TrieNode() {
    isEndOfWord = false;
    prefixCount = 0;
  }
}

class Trie {
  private TrieNode root;

  Trie() {
    root = new TrieNode();
  }

  // Insert a word into the Trie
  public void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
      int idx = c - 'a';
      if (node.children[idx] == null) {
        node.children[idx] = new TrieNode();
      }
      node = node.children[idx];
      node.prefixCount++;
    }
    node.isEndOfWord = true;
  }

  // Count words with given prefix
  public int countWordsWithPrefix(String prefix) {
    TrieNode node = root;
    for (char c : prefix.toCharArray()) {
      int idx = c - 'a';
      if (node.children[idx] == null) {
        return 0;
      }
      node = node.children[idx];
    }
    return node.prefixCount;
  }
}

public class CPrefixProblem {
  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("apple");
    trie.insert("app");
    trie.insert("apex");
    trie.insert("bat");

    System.out.println(trie.countWordsWithPrefix("ap")); // Output: 3
    System.out.println(trie.countWordsWithPrefix("app")); // Output: 2
    System.out.println(trie.countWordsWithPrefix("ba")); // Output: 1
    System.out.println(trie.countWordsWithPrefix("cat")); // Output: 0
  }
}
