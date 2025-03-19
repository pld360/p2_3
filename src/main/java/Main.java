import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Wprowadź liczbę a: ");
    int a = scanner.nextInt();
    
    System.out.print("Wprowadź liczbę b: ");
    int b = scanner.nextInt();
    
    int suma = a + b;
    System.out.println("Suma " + a + " oraz " + b + " jest równa: " + suma);
    
    scanner.close();
  }
}
