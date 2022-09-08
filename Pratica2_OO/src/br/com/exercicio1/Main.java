package br.com.exercicio1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nome;
    int qtdAtual, qtdMinima, qtde;    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Entre com o nome do produto: ");
    nome = entrada.nextLine();
    System.out.print("Entre com a quantidade inicial do produto: ");
    qtdAtual = entrada.nextInt();
    System.out.print("Entre com quantidade minima do produto: ");
    qtdMinima = entrada.nextInt();

    Estoque estoque = new Estoque(nome, qtdAtual, qtdMinima);
    System.out.println("Produto cadastrado com sucesso!");
    
    System.out.print("Informe a quantidade para saída do produto: ");
    qtde = entrada.nextInt();
    estoque.darBaixa(qtde);    
    if(estoque.precisaRepor()){
      System.out.println("Produto precisa de reposição!");
    }
    System.out.println(estoque.mostra());

  }
}
