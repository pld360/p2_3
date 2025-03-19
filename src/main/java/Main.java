import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Wprowadź liczbę a: ");
    int a = scanner.nextInt();
    
    System.out.print("Wprowadź liczbę b: ");
    int b = scanner.nextInt();
    
    int suma = sqrt(a) + sqrt(b);
    System.out.println("Suma pierwiastków " + a + " oraz " + b + " jest równa: " + suma);
    
    scanner.close();
  }
}
