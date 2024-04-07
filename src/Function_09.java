import java.util.Scanner;

public class Function_09 {
    public static int reverseNumber(int number){
        int reverse = 0;
        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
       // Reverse the number: Do it a function and return the reverse number. For Exemple → 127 = 721.

        Scanner input = new Scanner(System.in);

        System.out.println("Input The Number: ");
        Integer number = input.nextInt();
        System.out.println("The Reverse Number is: " + reverseNumber(number));


    }
}
