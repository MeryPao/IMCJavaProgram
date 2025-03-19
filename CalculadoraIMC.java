import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Tu Índice de Masa Corporal (IMC) es: " + imc);
    }
}