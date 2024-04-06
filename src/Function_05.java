import java.util.Scanner;

public class Function_05 {
    public static double somaImposto(double taxaImposto, double custo){
        return custo + (custo * taxaImposto / 100);
    }
    public static void main(String[] args) {

        // Faça um programa com uma função chamada somaImposto.
        // A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa
        // em porcentagem e custo, que é o custo de um item antes do imposto.
        // A função “altera” o valor de custo para incluir o imposto sobre vendas.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o custo do item: R$");
        double custo = input.nextDouble();
        System.out.println("Digite a taxa de imposto sobre vendas: ");
        double imposto = input.nextDouble();
        System.out.println("O custo do item com imposto é: R$" + somaImposto(imposto, custo));
    }
}
