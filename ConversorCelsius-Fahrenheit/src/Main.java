import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao conversor de temperatura!");
        System.out.print("Digite a temperatura em Celsius para a conversão em Fahrenheit: ");
        String resposta = scanner.nextLine();
        int respostaConv = Integer.parseInt(resposta);
        int tempCelsius = (int) ((1.8 * respostaConv) + 32);
        System.out.println("O valor em Fahrenheit é: " + tempCelsius);

    }
}