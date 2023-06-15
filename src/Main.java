import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int fizz = 3;
        final int buzz = 5;

        System.out.print("Nhap so luong: ");
        Scanner scanner = new Scanner(System.in);
        int inputQuantity = 0;

        try {
            inputQuantity = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
            return;
        }
        if (inputQuantity <= 0) {
            System.out.println("So luong khong du!");
            return;
        }

        int tmp = 0;
        for (int i = 0; i < inputQuantity; i++) {
            System.out.print("Nhap so: ");
            try {
                tmp = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input error!");
                break;
            }

            fFizzBuzz(fizz, buzz, tmp);

        }

        scanner.close();
    }

    public static void fFizzBuzz(final int fizz, final int buzz, int inputNumber) {
        boolean isFizzBuzz = false;
        if (inputNumber % fizz == 0) {
            System.out.print("Fizz");
            isFizzBuzz = true;
        }
        if (inputNumber % buzz == 0) {
            System.out.print("Buzz");
            isFizzBuzz = true;
        }
        if (!isFizzBuzz) {
            System.out.print(inputNumber);
        }
        System.out.println();
    }
}