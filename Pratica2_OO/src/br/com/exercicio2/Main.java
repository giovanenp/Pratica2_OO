package br.com.exercicio2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double investimento, taxaJuros;    
    int meses;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o valor inicial para investimento: ");
    investimento = entrada.nextDouble();
    System.out.print("Informe a taxa de Juros mensal da aplicação: ");
    taxaJuros = entrada.nextDouble();
    System.out.print("Informe quantos meses o valor ficará aplicado: ");
    meses = entrada.nextInt();

    Rendimento aplicacao = new Rendimento(investimento, taxaJuros, meses);    
    aplicacao.calculaRendimento();
    System.out.println(aplicacao.mostraRendimento());
  }
}
