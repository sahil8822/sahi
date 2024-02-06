import java.util.*;
abstract class A {
  abstract void add();
  abstract void sub(int a, int b);
  abstract int multi();
  abstract int div(int a, int b);
  abstract int modular(int a, int b);
}

public class App extends A{
  void add() {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Addition: "+ a+b);
      
  }

  void sub(int a, int b) {
    System.out.println(a-b);

  }

  int multi() {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
      return a * b;
  }

  int div(int a, int b) {
      return a / b;
  }

  int modular(int a, int b) {
      return a % b;
  }
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  
  App q=new App();
  q.add();
  q.sub(a, b);
  System.out.println("Multiplication: " + q.multi());
  System.out.println("Division: " + q.div(a, b)); 
  System.out.println("Modulus: " + q.modular(a, b));
  sc.close();
}
  
}

