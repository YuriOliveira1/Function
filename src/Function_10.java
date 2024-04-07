import java.util.Random;
public class Function_10 {
    public static int dice() {
        Random random = new Random();
        int min = 2;
        int max = 12;
        int randomNumberInRange = random.nextInt(max - min + 1) + min;
        return randomNumberInRange;
    }

    public static void verification() {
        int diceResult = dice();

        if (diceResult == 7 || diceResult == 11) {
            System.out.println("YOU WIN!!!! CONGRATULATION");
        } else if (diceResult == 2 || diceResult == 3 || diceResult == 12) {
            System.out.println("YOU LOSE");
        } else if (diceResult == 4 || diceResult == 5 || diceResult == 6 || diceResult == 8 || diceResult == 9 || diceResult == 10) {
            System.out.println("Dice: " + diceResult);
            System.out.println("Now it's your POINT");

            int point = diceResult;
            int roll;

            do {
                roll = dice();
                System.out.println("Next roll: " + roll);
                if (roll == point) {
                    System.out.println("YOU WIN");
                    return;
                }
            } while (roll != 7);
            System.out.println("YOU LOSE");
        }
    }

    public static void main(String[] args) {
        // Dice from 2 to 12, random
        // First Round: 7 or 11 = Win "Natural"
        // If dice raffle 2, 3 or 12 in the first round you lose, and this is call "Craps"
        // If in the first round, you did a 4, 5, 6, 8, 9 or 10, this is your "Point"
        // My objetive now is playing the dices to throw this number again
        // You Lose, if throw a 7 before throw this point again

        System.out.println("CRAPS GAME:" + "\n");
        System.out.println("Playing the dice");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "...");
        }
        verification();
    }
}

