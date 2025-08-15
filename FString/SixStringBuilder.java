package FString;

public class SixStringBuilder {
  public static void main(String[] args) {
    StringBuilder name = new StringBuilder("DanishKhan");

    StringBuilder aToz = new StringBuilder("");
    for (char i = 'a'; i <= 'z'; i++) {
      aToz.append(i);
    }
    System.out.println(aToz);
  }
}
