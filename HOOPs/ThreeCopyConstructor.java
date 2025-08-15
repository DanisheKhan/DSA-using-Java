package HOOPs;

public class ThreeCopyConstructor {
  public static void main(String[] args) {
    Student s1 = new Student("Danish", 32);
    Student s2 = new Student(s1); // Using copy constructor

    System.out.println("s1: " + s1.name + ", " + s1.roll);
    System.out.println("s2: " + s2.name + ", " + s2.roll);
  }
}

class Student {
  String name;
  int roll;

  // Parameterized constructor
  Student(String name, int roll) {
    this.name = name;
    this.roll = roll;
  }

  // Copy constructor
  Student(Student s) {
    this.name = s.name;
    this.roll = s.roll;
  }
}