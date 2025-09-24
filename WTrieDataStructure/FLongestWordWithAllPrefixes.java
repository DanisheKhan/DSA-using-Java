package WTrieDataStructure;

import java.util.*;

class TrieNode {
  TrieNode[] children = new TrieNode[26];
  boolean isEnd = false;
  String word = "";
}

class Trie {
  TrieNode root = new TrieNode();

  public void insert(String word) {
    TrieNode node = root;
    for (char ch : word.toCharArray()) {
      int idx = ch - 'a';
      if (node.children[idx] == null) {
        node.children[idx] = new TrieNode();
      }
      node = node.children[idx];
    }
    node.isEnd = true;
    node.word = word;
  }
}

public class FLongestWordWithAllPrefixes {
  public static void main(String[] args) {
    String[] words = { "w", "wo", "wor", "worl", "world", "banana", "ban", "bana", "banan" };
    System.out.println(longestWord(words));
  }

  public static String longestWord(String[] words) {
    Trie trie = new Trie();
    for (String word : words) {
      trie.insert(word);
    }

    String result = "";
    Queue<TrieNode> queue = new LinkedList<>();
    queue.offer(trie.root);

    while (!queue.isEmpty()) {
      TrieNode node = queue.poll();
      for (int i = 25; i >= 0; i--) { // To get lexicographically smallest
        TrieNode child = node.children[i];
        if (child != null && child.isEnd) {
          queue.offer(child);
          if (child.word.length() > result.length()
              || (child.word.length() == result.length() && child.word.compareTo(result) < 0)) {
            result = child.word;
          }
        }
      }
    }
    return result;
  }
}
