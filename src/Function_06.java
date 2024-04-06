import java.util.Scanner;
public class Function_06 {
    public static int converteHora(int hora, int minutos, String perido){

        if (hora > 12 && perido.equals("A")) {
            hora = hora - 12;
            System.out.println(hora + ":" + minutos + " A.M.");
        } else if (hora < 12 && perido.equals("A")) {
            System.out.println(hora + ":" + minutos + " A.M.");
        }
        if (hora > 12 && perido.equals("P")) {
            hora = hora - 12;
            System.out.println(hora + ":" + minutos + " P.M.");
        } else if (hora < 12 && perido.equals("P")) {
            System.out.println(hora + ":" + minutos + " P.M.");
        }
        return hora;
    }
    public static void main(String[] args) {
        // Faça um programa que converta da notação de 24 horas para a notação de 12 horas.
        // Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros.
        // Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída.
        // Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função
        // para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua
        // um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.

        // Exemplo de entrada:
        // Digite a hora: 14
        // Digite os minutos: 25
        // Digite A para A.M. ou P para P.M.: P
        // Exemplo de saída:
        // 2:25 P.M.
        String cancelar;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite a hora: ");
            int hora = input.nextInt();
            System.out.println("Digite os minutos: ");
            int minutos = input.nextInt();
            input.nextLine();
            System.out.println("Digite A para A.M ou P para P.M: ");
            String periodo = input.nextLine().toUpperCase();

            converteHora(hora, minutos, periodo);

            System.out.println("Para cancelar o Programa Digite: Abelha ");
            cancelar = input.nextLine().toUpperCase();

        } while (!cancelar.equals("ABELHA"));

    }
}
