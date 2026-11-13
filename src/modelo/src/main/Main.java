package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario iu = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        double valorImovel = iu.pedirValorImovel();
        int prazo = iu.pedirPrazoFinanciamento();
        double taxa = iu.pedirTaxaJuros();

        financiamentos.add(
                new Financiamento(valorImovel, prazo, taxa)
        );

        financiamentos.add(
                new Financiamento(200000, 20, 0.10)
        );

        financiamentos.add(
                new Financiamento(300000, 25, 0.12)
        );

        financiamentos.add(
                new Financiamento(150000, 15, 0.08)
        );

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        System.out.println("\n===== LISTA DE FINANCIAMENTOS =====");

        for (Financiamento financiamento : financiamentos) {

            financiamento.exibirDadosFinanciamento();

            totalImoveis += financiamento.getValorImovel();

            totalFinanciamentos += financiamento.calcularTotalPagamento();
        }

        System.out.println("\n===== TOTAIS =====");

        System.out.printf("Total dos imóveis: R$ %.2f%n", totalImoveis);

        System.out.printf(
                "Total dos financiamentos: R$ %.2f%n",
                totalFinanciamentos
        );
    }
}
