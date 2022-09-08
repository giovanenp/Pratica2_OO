package br.com.exercicio2;

public class Rendimento {
  private double valor;
  private double taxaJuros;
  private int meses;
  private double valorInicial;

  public Rendimento(double valor, double taxaJuros, int meses) {
    this.valor = valor;
    this.taxaJuros = taxaJuros;
    this.meses = meses;
    this.valorInicial = valor;
  }

  public void calculaRendimento() {
    for (int i = 1; i <= meses; i++) {
      this.valor = this.valor + ((this.valor * taxaJuros) / 100);
      System.out.println("Mês " + i + " - rendimento/mês " + (this.valor));
    }    
  }

  public String mostraRendimento() {
    return "\nInvestimento: " + this.valorInicial + "\nTaxa do Rendimento: " + this.taxaJuros + "% a/m \nNúmero de meses: "
        + this.meses + "\nValor final após 12 meses: " + this.valor; 
  }
}
