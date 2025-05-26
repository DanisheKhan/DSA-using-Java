import java.util.*;
// [Boilerplate code]
// public class JavaBasic{
//   public static void main(String args[]){
//     
//   }
// }

public class JavaBasic {
  public static void main(String args[]) {

    // ! output print format
    // System.out.println("hello world");
    // System.out.print("hello world\n");

    // ! pattern print
    // System.out.println(" ****\n ***\n **\n *");

    // ! variable declaration
    // int a = 10;
    // int b = 20;
    // String name = "danish khan";
    // byte byteValue = 127;
    // short shortValue = 32767;
    // int intValue = 2147483647;
    // long longValue = 9223372036854775807L;
    // float floatValue = 3.14f;
    // double doubleValue = 3.14159265359;
    // char charValue = 'A';
    // boolean booleanValue = true;
    // String stringValue = "Hello Java";
    // int[] arrayValue = { 1, 2, 3, 4, 5 };
    // Integer wrapperInt = 100;

    // System.out.println(name);
    // System.out.println("byte: " + byteValue);
    // System.out.println(a + b);
    // System.out.println("short: " + shortValue);
    // System.out.println("int: " + intValue);
    // System.out.println("long: " + longValue);
    // System.out.println("float: " + floatValue);
    // System.out.println("double: " + doubleValue);
    // System.out.println("char: " + charValue);
    // System.out.println("boolean: " + booleanValue);
    // System.out.println("String: " + stringValue);
    // System.out.print("Array: ");
    // for (int i = 0; i < arrayValue.length; i++) {
    // System.out.print(arrayValue[i] + " ");
    // }
    // System.out.println("\nWrapper class: " + wrapperInt);

    // ! add two numbers
    // int a = 10;
    // int b = 10;
    // System.out.println(a + b);

    // ! take input
    // Basic input examples with Scanner class
    // Scanner scanner = new Scanner(System.in);

    // System.out.println("===== Taking Different Types of Input =====");

    // Integer input
    // System.out.print("Enter an integer: ");
    // int integerInput = scanner.nextInt();
    // System.out.println("You entered integer: " + integerInput);

    // Float input
    // System.out.print("Enter a float: ");
    // float floatInput = scanner.nextFloat();
    // System.out.println("You entered float: " + floatInput);

    // Double input
    // System.out.print("Enter a double: ");
    // double doubleInput = scanner.nextDouble();
    // System.out.println("You entered double: " + doubleInput);

    // Boolean input
    // System.out.print("Enter a boolean (true/false): ");
    // boolean booleanInput = scanner.nextBoolean();
    // System.out.println("You entered boolean: " + booleanInput);

    // Character input (need to get a String and take first char)
    // System.out.print("Enter a character: ");
    // char charInput = scanner.next().charAt(0);
    // System.out.println("You entered character: " + charInput);

    // String input (single word)
    // System.out.print("Enter a word: ");
    // String wordInput = scanner.next();
    // System.out.println("You entered word: " + wordInput);

    // Consuming the leftover newline
    // scanner.nextLine();

    // String input (full line)
    // System.out.print("Enter a sentence: ");
    // String lineInput = scanner.nextLine();
    // System.out.println("You entered sentence: " + lineInput);

    // Long input
    // System.out.print("Enter a long number: ");
    // long longInput = scanner.nextLong();
    // System.out.println("You entered long: " + longInput);

    // Close the scanner when done
    // scanner.close();

    // ! sum a and b using scanner or user input
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the value of A");
    // int a = sc.nextInt();
    // System.out.println("enter the value of B");
    // int b = sc.nextInt();
    // System.out.println("the sum is " + (a + b));
    // sc.close(); // Close the scanner to prevent resource leak

    // ! type casting
    // int marks = (int) (99.99f);
    // System.out.println(marks);

    // ! operators
    // int a = 10, b = 3;
    // System.out.println("a + b = " + (a + b)); // Addition
    // System.out.println("a - b = " + (a - b)); // Subtraction
    // System.out.println("a * b = " + (a * b)); // Multiplication
    // System.out.println("a / b = " + (a / b)); // Division
    // System.out.println("a % b = " + (a % b)); // Modulus
    // System.out.println("++a = " + (++a)); // Pre-increment
    // System.out.println("b++ = " + (b++)); // Post-increment
    // System.out.println("b after post-increment = " + b);
    // System.out.println("--a = " + (--a)); // Pre-decrement
    // System.out.println("b-- = " + (b--)); // Post-decrement
    // System.out.println("b after post-decrement = " + b);

    // int c = 10; // Simple assignment
    // System.out.println("c = " + c);
    // c += 5; // Add AND assignment
    // System.out.println("c += 5: " + c);
    // c -= 3; // Subtract AND assignment
    // System.out.println("c -= 3: " + c);
    // c *= 2; // Multiply AND assignment
    // System.out.println("c *= 2: " + c);
    // c /= 4; // Divide AND assignment
    // System.out.println("c /= 4: " + c);
    // c %= 2; // Modulus AND assignment
    // System.out.println("c %= 2: " + c);

    // System.out.println("a == b: " + (a == b)); // Equal to
    // System.out.println("a != b: " + (a != b)); // Not equal to
    // System.out.println("a > b: " + (a > b)); // Greater than
    // System.out.println("a < b: " + (a < b)); // Less than
    // System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
    // System.out.println("a <= b: " + (a <= b)); // Less than or equal to

    // boolean x = true, y = false;
    // System.out.println("x && y: " + (x && y)); // Logical AND
    // System.out.println("x || y: " + (x || y)); // Logical OR
    // System.out.println("!x: " + (!x)); // Logical NOT

    // int d = 5; // 0101 in binary
    // int e = 3; // 0011 in binary
    // System.out.println("d & e: " + (d & e)); // Bitwise AND
    // System.out.println("d | e: " + (d | e)); // Bitwise OR
    // System.out.println("d ^ e: " + (d ^ e)); // Bitwise XOR
    // System.out.println("~d: " + (~d)); // Bitwise NOT
    // System.out.println("d << 1: " + (d << 1)); // Left shift
    // System.out.println("d >> 1: " + (d >> 1)); // Right shift
    // System.out.println("d >>> 1: " + (d >>> 1));// Unsigned right shift

    // int min = (a < b) ? a : b;
    // System.out.println("min of " + a + " and " + b + " is: " + min);

    // String str = "Hello";
    // System.out.println("str instanceof String: " + (str instanceof String));

    // ! conditional statements
    // // 1. If statement
    // int num = 10;
    // System.out.println("===== If Statement =====");
    // if (num > 0) {
    // System.out.println("Number is positive");
    // }

    // // 2. If-else statement
    // System.out.println("\n===== If-Else Statement =====");
    // int age = 17;
    // if (age >= 18) {
    // System.out.println("You are an adult");
    // } else {
    // System.out.println("You are a minor");
    // }

    // // 3. If-else-if ladder
    // System.out.println("\n===== If-Else-If Ladder =====");
    // int score = 75;
    // if (score >= 90) {
    // System.out.println("Grade: A");
    // } else if (score >= 80) {
    // System.out.println("Grade: B");
    // } else if (score >= 70) {
    // System.out.println("Grade: C");
    // } else if (score >= 60) {
    // System.out.println("Grade: D");
    // } else {
    // System.out.println("Grade: F");
    // }

    // // 4. Nested if statements
    // System.out.println("\n===== Nested If Statements =====");
    // int number = 15;
    // if (number > 0) {
    // System.out.println("Number is positive");
    // if (number % 2 == 0) {
    // System.out.println("Number is even");
    // } else {
    // System.out.println("Number is odd");
    // }
    // }

    // // 5. Switch statement
    // System.out.println("\n===== Switch Statement =====");
    // int day = 4;
    // switch (day) {
    // case 1:
    // System.out.println("Monday");
    // break;
    // case 2:
    // System.out.println("Tuesday");
    // break;
    // case 3:
    // System.out.println("Wednesday");
    // break;
    // case 4:
    // System.out.println("Thursday");
    // break;
    // case 5:
    // System.out.println("Friday");
    // break;
    // case 6:
    // System.out.println("Saturday");
    // break;
    // case 7:
    // System.out.println("Sunday");
    // break;
    // default:
    // System.out.println("Invalid day");
    // }

    // // 6. Switch expression (Java 14+)
    // System.out.println("\n===== Switch Expression =====");
    // String fruit = "Apple";
    // String fruitType = switch (fruit) {
    // case "Apple", "Pear" -> "Pome fruit";
    // case "Cherry", "Plum" -> "Stone fruit";
    // case "Blackberry" -> "Berry";
    // default -> "Unknown fruit type";
    // };
    // System.out.println(fruit + " is a " + fruitType);

    // // 7. Ternary operator
    // System.out.println("\n===== Ternary Operator =====");
    // int x = 5;
    // String result = (x % 2 == 0) ? "Even" : "Odd";
    // System.out.println(x + " is " + result);

    // !loops
    // // For loop - used when number of iterations is known
    // System.out.println("\n===== For Loop =====");
    // System.out.println("Counting from 1 to 5:");
    // for (int i = 1; i <= 5; i++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();

    // // While loop - used when iterations depend on a condition
    // System.out.println("\n===== While Loop =====");
    // System.out.println("Counting down from 5 to 1:");
    // int j = 5;
    // while (j >= 1) {
    // System.out.print(j + " ");
    // j--;
    // }
    // System.out.println();

    // // Do-while loop - executes at least once
    // System.out.println("\n===== Do-While Loop =====");
    // System.out.println("Counting from 1 to 5:");
    // int k = 1;
    // do {
    // System.out.print(k + " ");
    // k++;
    // } while (k <= 5);
    // System.out.println();

    // // Enhanced for loop (for-each) - used for collections/arrays
    // System.out.println("\n===== Enhanced For Loop =====");
    // int[] numbers = {1, 2, 3, 4, 5};
    // System.out.println("Array elements:");
    // for (int num : numbers) {
    // System.out.print(num + " ");
    // }
    // System.out.println();

    // // Nested loops - loop inside another loop
    // System.out.println("\n===== Nested Loops =====");
    // System.out.println("Pattern printing:");
    // for (int row = 1; row <= 3; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // // Loop with break statement
    // System.out.println("\n===== Loop with break =====");
    // for (int i = 1; i <= 10; i++) {
    // if (i == 6) {
    // break; // exits loop when i equals 6
    // }
    // System.out.print(i + " ");
    // }
    // System.out.println();

    // // Loop with continue statement
    // System.out.println("\n===== Loop with continue =====");
    // for (int i = 1; i <= 10; i++) {
    // if (i % 2 == 0) {
    // continue; // skips even numbers
    // }
    // System.out.print(i + " ");
    // }
    // System.out.println();

    // // Infinite loop with control statement
    // System.out.println("\n===== Controlled Infinite Loop =====");
    // int counter = 1;
    // for (;;) { // infinite loop
    // System.out.print(counter + " ");
    // counter++;
    // if (counter > 5) {
    // break; // exit condition
    // }
    // }
    // System.out.println();

    // ! Printing patterns
    // System.out.println("printing reverse numbers");
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number that u would like to reverse");
    // int n = sc.nextInt();
    // sc.close();
    // while (n > 0) {
    // int lastDigit = n % 10;
    // System.out.print(lastDigit);
    // n /= 10;
    // }

    // ! reverse the number
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number to reverse: ");
    // int number = scanner.nextInt();

    // int originalNumber = number;
    // int reversedNumber = 0;

    // while (number != 0) {
    // int lastDigit = number % 10;
    // reversedNumber = reversedNumber * 10 + lastDigit;
    // number = number / 10;
    // }

    // System.out.println("Original number: " + originalNumber);
    // System.out.println("Reversed number: " + reversedNumber);
    // scanner.close();

    // ! keep entering numbers till user enters a multiple of 10
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("enter u r number:");
    // int number = scanner.nextInt();
    // for (int i = 0; i < 1; i++) {
    // if (number % 10 == 0) {
    // System.out.println("programme is break");
    // break;
    // }
    // ;
    // System.out.println(number);
    // }
    // scanner.close();

    // ! check if a number is even or odd
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("enter your number :");
    // int number = scanner.nextInt();
    // if (number % 2 == 0) {
    // System.out.println("this is even ");
    // }else{
    // System.out.println("odd number");
    // }
    // scanner.close();

    // ! write a programme of finding prime number
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number to check if it's prime: ");
    // int number = scanner.nextInt();
    // boolean isPrime = true;

    // if (number <= 1) {
    // isPrime = false;
    // } else {
    // // Check for divisibility from 2 to square root of number
    // for (int i = 2; i <= Math.sqrt(number); i++) {
    // if (number % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // }

    // if (isPrime) {
    // System.out.println(number + " is a prime number");
    // } else {
    // System.out.println(number + " is not a prime number");
    // }
    // scanner.close();

    // ! stars pattern
    // System.out.print("enter the number of lines:");
    // Scanner sc = new Scanner(System.in);
    // int lines = sc.nextInt();
    // for (int line = 1; line <= lines; line++) {
    // for (int star = 1; star <= line; star++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // sc.close();

    // ! Inverted Star Pattern
    // int n=4;
    // for (int line = 1; line <= n; line++) {
    // for (int star = 1; star <= n-line+1; star++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // ! print half pyramid pattern
    // int n=4;
    // for(int line=0; line<=n; line++){
    // for(int num=1; num<=line; num++){
    // System.out.print(num);
    // }
    // System.out.println();
    // }

    // ! print characters
    // int n = 4;
    // char ch = 'A';
    // for (int line = 1; line <= n; line++) {
    // for (int chars = 1; chars <= line; chars++) {
    // System.out.print(ch);
    // ch++;
    // }
    // System.out.println();
    // }

  }

}