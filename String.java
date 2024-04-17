import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String inputString = scanner.nextLine();

    StringProcessor processor = new StringProcessor(inputString);

    System.out.println("Frase em maiúsculo: " + processor.toUpperCase());
    System.out.println("Frase em minúsculo: " + processor.toLowerCase());
    System.out.println("Número de caracteres: " + processor.length());
    System.out.println("Frase invertida: " + processor.reverse());

    scanner.close();
  }
}

class StringProcessor {
  private String inputString;

  public StringProcessor(String inputString) {
    this.inputString = inputString;
  }

  public String toUpperCase() {
    return inputString.toUpperCase();
  }

  public String toLowerCase() {
    return inputString.toLowerCase();
  }

  public int length() {
    return inputString.length();
  }
  public String reverse() {
    return new StringBuilder(inputString).reverse().toString();
  }
}
