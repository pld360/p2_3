import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = 0, b = 0;

    while (true) {
      try {
        System.out.print("Wprowadź liczbę a: ");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);
        if (a >= 0) break;
        System.out.println("Liczba musi być nieujemna!");
      } catch (NumberFormatException e) {
        System.out.println("To nie jest liczba, wprowadź liczbę.");
      }
    }
    
     while (true) {
      try {
        System.out.print("Wprowadź liczbę b: ");
        String input = scanner.nextLine();
        b = Integer.parseInt(input);
        if (b >= 0) break;
        System.out.println("Liczba musi być nieujemna!");
      } catch (NumberFormatException e) {
        System.out.println("To nie jest liczba, wprowadź liczbę.");
      }
    }
    
    double suma = Math.sqrt(a) + Math.sqrt(b);
    System.out.println("Suma pierwiastków " + a + " oraz " + b + " jest równa: " + suma);
    
    scanner.close();
  }
}
