package IRecursion;

public class LFriendsPairing {
  public static int countFriendsPairings(int n) {
    if (n <= 1)
      return 1;
    if (n == 2)
      return 2;
    return countFriendsPairings(n - 1) + (n - 1) * countFriendsPairings(n - 2);
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(countFriendsPairings(n));
  }
}
