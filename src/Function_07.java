import java.util.Scanner;

public class Function_07 {
    public static double valorPagamento(double prestacao, int dias){
        if (dias == 0) {
            return prestacao;
        } else {
            return prestacao + (prestacao * 0.03) + (prestacao * 0.001 * dias);
        }
    }
    public static void main(String[] args){

        // Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta.
        // O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores
        // para a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou.
        // O programa deverá então exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro
        // valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação. Neste momento
        // o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia.
        // O cálculo do valor a ser pago é feito da seguinte forma.
        // Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

        double prestacao, soma = 0;
        int qtdPagas = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite o valor da prestação: ");
            prestacao = input.nextDouble();
            if (prestacao != 0){
                soma += prestacao;
                qtdPagas++;
            }
            System.out.println("Digite o número de dias em atraso: ");
            int dias = input.nextInt();

            System.out.println("O valor a ser pago é: R$" + valorPagamento(prestacao, dias));
        }
        while (prestacao != 0);

        System.out.println("Relatório do dia: "+"\n");
        System.out.println("Quantidade de prestações pagas: " + qtdPagas);
        System.out.println("Valor total de prestações pagas: R$" + soma);
    }
}
