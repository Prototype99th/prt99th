import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Bem vindo à calculadora simples!");
    System.out.println("Por favor, insira dois números e a operação desejada (+, -, *, /):");
// Receptor de números e a operação do usuário
    System.out.print("Número 1: ");
    int num1= sc.nextInt();
    System.out.print("Número 2: ");
    int num2= sc.nextInt();
    System.out.print("Operação (+, -, *, /): ");
    char operador = sc.next().charAt(0);

// Verificando a operação e realizando o cálculo correspondente
    if(operador == '+'){
      System.out.println(soma (num1,num2));
    }else if(operador == '-'){
        System.out.println(subtracao (num1,num2));
      }
    else if(operador == '*'){
      System.out.println(multiplicacao (num1,num2));
    }
    else if(operador == '/'){
      if (num2 != 0){
      System.out.println("O resultado é: " + divisao(num1,num2));
    }else{
        System.out.println("Erro: Divisão por zero!");
          return;
  }
    }else{
      System.out.println("Operação invalida");
    }
  }

  // Métodos para o cálculo das operações
  public static int soma(int a, int b){
    return a+b;
  }
  public static int multiplicacao(int a, int b){
    return a*b;
  }
  public static int divisao(int a, int b){
    return a/b;
  }
  public static int subtracao(int a, int b){
    return a-b;
  }
}
