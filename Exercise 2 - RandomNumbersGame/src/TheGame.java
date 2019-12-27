import java.util.Scanner;


public class TheGame {
    public static void main(String[] args) {
        int randoNum = (int) (Math.random() * 100) + 1; // 1 to 100

        //start the game
        System.out.println("Let's play a guessing game");
        Scanner scanner = new Scanner(System.in); //listening at the terminal
        boolean guessedRight = false;
        for (int i = 10; i > 0; i--) {
            System.out.println("Take a guess: ");
            int guess = scanner.nextInt(); // returns the int that was input before hitting enter
            if (guess > randoNum){
                System.out.println("Guessed too high");
            } else if (guess < randoNum) {
                System.out.println("Guessed too low");
            } else {
                System.out.println("You guessed correctly.");
                guessedRight = true;
                break;
            }
        }
        if (!guessedRight){
            System.out.println("You lost the game");
        }
    }
}
