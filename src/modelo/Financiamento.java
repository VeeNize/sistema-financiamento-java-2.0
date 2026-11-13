package modelo;

public class Financiamento {

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return (valorImovel / (prazoFinanciamento * 12.0))
                * (1 + (taxaJurosAnual / 12.0));
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void exibirDadosFinanciamento() {
        System.out.println("\n===== FINANCIAMENTO =====");
        System.out.printf("Valor do imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Prazo: %d anos%n", prazoFinanciamento);
        System.out.printf("Taxa de juros: %.2f%n", taxaJurosAnual);
        System.out.printf("Pagamento mensal: R$ %.2f%n",
                calcularPagamentoMensal());
        System.out.printf("Valor total do financiamento: R$ %.2f%n",
                calcularTotalPagamento());
    }
}
