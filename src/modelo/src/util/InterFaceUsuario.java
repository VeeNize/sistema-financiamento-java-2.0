package util;

import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {

        double valor;

        do {
            System.out.print("Digite o valor do imóvel: R$ ");
            valor = scanner.nextDouble();

            if (valor <= 0) {
                System.out.println("Erro! Digite um valor maior que zero.");
            }

        } while (valor <= 0);

        return valor;
    }

    public int pedirPrazoFinanciamento() {

        int prazo;

        do {
            System.out.print("Digite o prazo do financiamento em anos: ");
            prazo = scanner.nextInt();

            if (prazo <= 0) {
                System.out.println("Erro! Digite um prazo maior que zero.");
            }

        } while (prazo <= 0);

        return prazo;
    }

    public double pedirTaxaJuros() {

        double taxa;

        do {
            System.out.print("Digite a taxa de juros anual: ");
            taxa = scanner.nextDouble();

            if (taxa <= 0) {
                System.out.println("Erro! Digite uma taxa maior que zero.");
            }

        } while (taxa <= 0);

        return taxa;
    }
}
