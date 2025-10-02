package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA SIMPLES ===");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                continuar = false;
                System.out.println("Encerrando a calculadora...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();

            try {
                double resultado = 0;
                switch (opcao) {
                    case 1:
                        resultado = calc.somar(a, b);
                        break;
                    case 2:
                        resultado = calc.subtrair(a, b);
                        break;
                    case 3:
                        resultado = calc.multiplicar(a, b);
                        break;
                    case 4:
                        resultado = calc.dividir(a, b);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        continue;
                }
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}
