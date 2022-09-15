package br.com.exercicio2;

public class Rendimento {
  private double valorInicial;
  private double taxaJuros;
  private int meses;

  public Rendimento(double valor, double taxaJuros, int meses) {
    this.taxaJuros = taxaJuros;
    this.meses = meses;
    this.valorInicial = valor;
  }

  public double getValorInicial() {
    return valorInicial;
  }

  public void setValorInicial(double valorInicial) {
    this.valorInicial = valorInicial;
  }

  public double getTaxaJuros() {
    return taxaJuros;
  }

  public void setTaxaJuros(double taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  public int getMeses() {
    return meses;
  }

  public void setMeses(int meses) {
    this.meses = meses;
  }

  public void calculaRendimento() {
    double totalRendimento = getValorInicial();

    for (int i = 0; i < getMeses(); i++) {
      totalRendimento += (totalRendimento * getTaxaJuros()) / 100;
      System.out.printf("\nMês %d - rendimento/mês %.2f", (i + 1), totalRendimento);
    }
  }

  public String mostraRendimento() {
    return "Investimento: " + getValorInicial() + "\nTaxa do Rendimento: " + getTaxaJuros()
        + "% a/m \nNúmero de meses: "
        + getMeses();
  }

}
