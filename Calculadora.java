import java.util.Scanner;
import java.util.locale;

public class Calculadora {

public static void main(String[] args) {

locale.setDefaut(Locale.US);

Scanner sc = new Scanner(System.in);

System.out.println(x: "--- Calculadora de Negócios (Java) ---");

System.out.print(s: "Digite o primeiro número: ");
double numero1 = sc.nextDouble();

System.out.print(s: "Digite o segundo número");
double numero2 = sc.nextDouble();

double soma = numero1 + numero2;
double subtracao = numero1 - numero2;
double multipicacao = numero1 * numero2;
double divisao = numero1 / numero2;

System.out.printf(format: "Soma: %.2f%n", soma);
System.out.printf(format: "Subtração: %.2f%n", subtracaoo);
System.out.printf(format:"Multiplicação: %.2f%n", multiplicacao);
System.out.printf(format:"Divisão: %.2f%n", divisao)

sc.close();
}

}