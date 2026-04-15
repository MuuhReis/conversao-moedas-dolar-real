import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            exibirMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    converterDollarParaReal(input);
                    break;

                case 2:
                    converterRealParaDollar(input);
                    break;

                case 3:
                    System.out.println("\nEncerrando programa...");
                    break;

                default:
                    System.out.println("\nOpcao invalida!\n");
            }
        }

        input.close();
    }

    // MÉTODOS

    public static void exibirMenu() {
        System.out.println("""
                \n=== CONVERSOR DE MOEDAS ===
                1 - Dollar -> Real
                2 - Real-> Dollar
                3 - Sair
                """);
    }

    public static void converterDollarParaReal(Scanner input) {
        System.out.print("Digite o valor em Dollar: ");
        float valor = input.nextFloat();

        System.out.print("Digite a cotacao do Dollar: ");
        float cotacao = input.nextFloat();

        if (valor <= 0 || cotacao <= 0) {
            System.out.println("\nValores invalidos!\n");
            return;
        }

        float resultado = valor * cotacao;
        System.out.println("Valor em Real: " + resultado + "\n");
    }

    public static void converterRealParaDollar(Scanner input) {
        System.out.print("Digite o valor em Real: ");
        float valor = input.nextFloat();

        System.out.print("Digite a cotacao do Dollar: ");
        float cotacao = input.nextFloat();

        if (valor <= 0 || cotacao <= 0) {
            System.out.println("\nValores invalidos!\n");
            return;
        }

        float resultado = valor / cotacao;
        System.out.println("Valor em Dollar: " + resultado + "\n");
    }
}