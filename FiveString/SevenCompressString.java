package FiveString;

public class SevenCompressString {
  
  public static String compressString(String str) {
    if (str == null || str.length() == 0) {
      return str;
    }
    
    StringBuilder compressed = new StringBuilder();
    int count = 1;
    
    for (int i = 0; i < str.length(); i++) {
      if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
        count++;
      } else {
        compressed.append(str.charAt(i));
        if (count > 1) {
          compressed.append(count);
        }
        count = 1;
      }
    }
    
    // Return original string if compressed is not shorter
    return compressed.length() < str.length() ? compressed.toString() : str;
  }
  
  public static void main(String[] args) {
    String str1 = "aabcccccaaa";
    String str2 = "abcdef";
    String str3 = "aabbcc";
    
    System.out.println("Original: " + str1 + " -> Compressed: " + compressString(str1));
    System.out.println("Original: " + str2 + " -> Compressed: " + compressString(str2));
    System.out.println("Original: " + str3 + " -> Compressed: " + compressString(str3));
  }
}