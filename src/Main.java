import java.util.Scanner;

public class Main {
    static int userInput;
    static int computerNum = (int) (Math.random() * 11);

    static void getInput() {
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10.");
        try {
            userInput = numInput.nextInt();
            checkResults();
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
            getInput();
        }
    }
    static void checkResults() {
        if (userInput < 0 || userInput > 10) {
            System.out.println("Please enter a valid number between 1 and 10.");
            getInput();
        }

        if (userInput == computerNum) {
            System.out.println("You guessed the number!");
            System.out.println(" ");
            computerNum = (int) (Math.random() * 11);
            getInput();
        } else if (userInput < computerNum) {
            System.out.println("The number is higher!");
            getInput();
        } else {
            System.out.println("The number is lower.");
            getInput();
        }
    }

    public static void main(String[] args) { getInput(); }

}