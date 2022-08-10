import java.util.Scanner;

class Main {
    int userGuess = 0;

    public void getInput() {
        System.out.println("Guess the number:");
        Scanner inputUser = new Scanner(System.in);
        try {
            userGuess = inputUser.nextInt();
        } catch (Exception e) {
            getInput();
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int computerNumber = (int) (Math.random() * 100 + 1);
        int guessCount = 0;

        System.out.println("A number between 1 and 100 has been chosen.\nTry to guess it with as few lines as possible!");
        obj.getInput();

        while (obj.userGuess != computerNumber) {
            if (obj.userGuess < 1 || obj.userGuess > 101) {
                obj.getInput();
                continue;
            }

            guessCount++;

            if (computerNumber > obj.userGuess) {
                System.out.println("The number is higher than " + obj.userGuess + "!");
                obj.getInput();
            } else {
                System.out.println("The number is lower than " + obj.userGuess + "!");
                obj.getInput();
            }
        }

        guessCount++;
        System.out.println("You were correct!");
        System.out.println("You got the answer in " + guessCount + " guesses!");
    }
}