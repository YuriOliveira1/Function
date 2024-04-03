import java.util.Scanner;

public class Function_03 {
    public static int somade3(int a1, int b2, int c3){
        int soma = a1 + b2 + c3;
        System.out.println("A soma dos valores é: " + soma);
        return(soma);
    }

    public static void main(String[] args) {
    // Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();
        somade3(a, b, c);
    }
}
