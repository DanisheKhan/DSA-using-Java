package WTrieDataStructure;

class Node {
  Node[] children = new Node[26];
  boolean isEnd = false;

  public Node() {}
}

class Trie {
  private Node root;

  public Trie() {
    root = new Node();
  }

  public void insert(String word) {
    Node node = root;
    for (char ch : word.toCharArray()) {
      int idx = ch - 'a';
      if (node.children[idx] == null) {
        node.children[idx] = new Node();
      }
      node = node.children[idx];
    }
    node.isEnd = true;
  }

  public boolean search(String word) {
    Node node = root;
    for (char ch : word.toCharArray()) {
      int idx = ch - 'a';
      if (node.children[idx] == null) {
        return false;
      }
      node = node.children[idx];
    }
    return node.isEnd;
  }
}

public class ATireBasics {
  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("apple");
    trie.insert("app");
  }
}