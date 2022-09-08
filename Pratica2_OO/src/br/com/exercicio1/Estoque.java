package br.com.exercicio1;

public class Estoque {
  private String nome;
  private int qtdAtual;
  private int qtdMinima;

  public Estoque(String nome, int qtdAtual, int qtdMinima) {
    this.nome = nome;
    this.qtdAtual = qtdAtual;
    this.qtdMinima = qtdMinima;
  }

  public String getNome() {
    return nome;
  }

  private void setNome(String nome) {
    this.nome = nome;
  }

  public int getQtdAtual() {
    return qtdAtual;
  }

  private void setQtdAtual(int qtdAtual) {
    this.qtdAtual = qtdAtual;
  }

  public int getQtdMinima() {
    return qtdMinima;
  }

  private void setQtdMinima(int qtdMinima) {
    this.qtdMinima = qtdMinima;
  }

  public void darBaixa(int qtde) {
    if (qtde < this.qtdAtual) {
      this.qtdAtual = this.qtdAtual - qtde;
    }
  }

  public String mostra() {
    return "Produto: " + this.nome + ", precisa ter no mínimo " + this.qtdMinima
        + " em estoque. Seu estoque atual é de: " + this.qtdAtual;
  }

  public boolean precisaRepor() {
    if (this.qtdAtual <= this.qtdMinima) {
      return true;
    } else {
      return false;
    }
  }
}
