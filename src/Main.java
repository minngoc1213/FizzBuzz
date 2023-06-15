import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int fizz = readNumber("Enter the fizz number: ");

        int buzz = readNumber("Enter the buzz number: ");

        int inputQuantity = readNumber("Enter the quantity number: ");

        if (inputQuantity <= 0) {
            System.out.println("Quantity number must be greater than 0!");
            return;
        }

        int tmp;
        for (int i = 0; i < inputQuantity; i++) {
            tmp = readNumber("Enter a number: ");

            System.out.println(handlerInput(fizz, buzz, tmp));

        }
    }

    public static String handlerInput(int fizz, int buzz, int inputNumber) {
        String result = "";

        if (inputNumber % fizz == 0) {
            result += "Fizz";
        }

        if (inputNumber % buzz == 0) {
            result += "Buzz";
        }

        if (result.equals("")) {
            result = String.valueOf(inputNumber);
        }

        return result;
    }

    public static int readNumber(String intro) {
        Scanner scanner = new Scanner(System.in);
        int tmp;

        System.out.print(intro);

        try {
            tmp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
            return 1;
        }

        return tmp;
    }
}