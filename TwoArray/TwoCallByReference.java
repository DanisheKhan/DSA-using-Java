package TwoArray;

public class TwoCallByReference {

  public static void update(int marks[], int nonChangeable) {
    nonChangeable = 10;
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }
  }

  public static void main(String[] args) {

    int nonChangeable = 1;
    int marks[] = { 11, 12, 13 };
    update(marks, nonChangeable);
    
    System.out.println(nonChangeable);
    for (int i = 0; i < marks.length; i++) {
      System.out.println("Marks :" + marks[i]);
    }

  }
}
