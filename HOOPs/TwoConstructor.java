package HOOPs;

public class TwoConstructor {
  public static void main(String[] args) {
    Student s1= new Student();
    Student s2= new Student("DanishKhan");
    Student s3= new Student(32);
  }
}

class Student {
  String name;
  int roll;

  Student() {
    System.out.println("constructor is called");
  }

  Student(String name) {
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }
}
