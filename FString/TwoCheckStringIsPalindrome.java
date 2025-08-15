package FString;

public class TwoCheckStringIsPalindrome {
  public static boolean isPalindrome(String word){
    for(int i=0; i<word.length()/2;i++){
      if(word.charAt(i)!= word.charAt(word.length()-i-1)){
        System.out.println("this is not a palindrome");
        return false;
      }
    }
    System.out.println("This is a palindrome");
    return true;
  }
  public static void main(String[] args) {
    String word = "racecar";
    isPalindrome(word);

  }
}
