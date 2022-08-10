import java.util.Scanner;

class Main {
    int userGuess = 0;

    public void getInput() {
        System.out.println("Please enter a number between 1-100 to guess.");
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

        obj.getInput();

        while (obj.userGuess != computerNumber) {
            if (obj.userGuess < 1 || obj.userGuess > 101) {
                obj.getInput();
                continue;
            }

            guessCount++;

            if (computerNumber > obj.userGuess) {
                System.out.println("The number is higher!");
                obj.getInput();
            } else {
                System.out.println("The number is lower!");
                obj.getInput();
            }
        }

        guessCount++;
        System.out.println("You were correct!");
        System.out.println("You got the answer in " + guessCount + " guesses!");
    }
}