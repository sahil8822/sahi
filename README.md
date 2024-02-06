import java.util.*;
abstract class A {
  abstract int add(int a, int b);
  abstract int sub(int a, int b);
  abstract int multi(int a, int b);
  abstract int div(int a, int b);
  abstract int modular(int a, int b);
}
class B extends A {
  int add(int a, int b) {
      return a + b;
  }

  int sub(int a, int b) {
      return a - b;
  }

  int multi(int a, int b) {
      return a * b;
  }

  int div(int a, int b) {
      return a / b;
  }

  int modular(int a, int b) {
      return a % b;
  }
}

public class App {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  B q=new B();
  System.out.println("Addition: " + q.add(a, b));
  System.out.println("Subtraction: " + q.sub(a, b));
  System.out.println("Multiplication: " + q.multi(a, b));
  System.out.println("Division: " + q.div(a, b)); 
  System.out.println("Modulus: " + q.modular(a, b));
  sc.close();
} 
}
