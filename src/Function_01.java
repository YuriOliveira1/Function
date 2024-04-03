import java.util.Scanner;

public class Function_01 {
    static void piramidenumerica (int num) {
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = input.nextInt();
        piramidenumerica(n);
    }
}
