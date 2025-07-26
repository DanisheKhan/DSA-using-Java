package SevenOOPs;


public class FiveShallowAndDeepcopy {
  public static void main(String[] args) {
    Address addr = new Address("Delhi");
    Student s1 = new Student("Danish", addr);

    // Shallow copy
    Student s2 = new Student(s1);
    // Deep copy
    Student s3 = new Student(s1, true);

    s1.address.city = "Mumbai";

    System.out.println("s1 address: " + s1.address.city); // Mumbai
    System.out.println("s2 address (shallow): " + s2.address.city); // Mumbai (same object)
    System.out.println("s3 address (deep): " + s3.address.city); // Delhi (separate object)
  }
}

class Address {
  String city;

  Address(String city) {
    this.city = city;
  }
}

class Student {
  String name;
  Address address;

  // Shallow copy constructor
  Student(Student s) {
    this.name = s.name;
    this.address = s.address; // Only reference is copied (shallow)
  }

  // Deep copy constructor
  Student(Student s, boolean deepCopy) {
    this.name = s.name;
    this.address = new Address(s.address.city); // New object created (deep)
  }

  Student(String name, Address address) {
    this.name = name;
    this.address = address;
  }
}
