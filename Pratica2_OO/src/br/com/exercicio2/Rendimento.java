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
    double totalRendimento = this.valorInicial;    

    for (int i = 1; i <= meses; i++) {
      totalRendimento += (totalRendimento * taxaJuros) / 100;
      System.out.printf("\nMês %d - rendimento/mês %.2f", i, totalRendimento);
    }
  }

  public String mostraRendimento() {
    return "Investimento: " + this.valorInicial + "\nTaxa do Rendimento: " + this.taxaJuros + "% a/m \nNúmero de meses: "
        + this.meses; 
  }

}
