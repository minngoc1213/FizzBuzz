import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fizz = readNumber("Enter the fizz number: ");

        int buzz = readNumber("Enter the buzz number: ");

        int inputQuantity = readNumber("Enter the quantity number: ");

        int inputNumber;
        for (int i = 0; i < inputQuantity; i++) {
            inputNumber = readNumber("Enter a number: ");

            System.out.println(handleInput(fizz, buzz, inputNumber));

        }
    }

    public static String handleInput(int fizz, int buzz, int inputNumber) {
        StringBuilder result = new StringBuilder();

        if (inputNumber % fizz == 0) {
            result.append("Fizz");
        }

        if (inputNumber % buzz == 0) {
            result.append("Buzz");
        }

        if (result.toString().equals("")) {
            result.append(inputNumber);
        }

        return result.toString();
    }

    public static int readNumber(String intro) {
        int inputNumber;
        System.out.print(intro);

        do {
            inputNumber = handleException();
            if (inputNumber < 1) {
                System.out.print("Please enter an integer number greater than 0: ");
            }
        } while (inputNumber < 1);

        return inputNumber;
    }

    public static int handleException() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        try {
            inputNumber = scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
        return inputNumber;
    }
}