import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int fizz = 3, buzz = 5;

        System.out.print("Nhap so luong: ");
        Scanner scanner = new Scanner(System.in);
        int n=0;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        if (n <= 0) {
            return;
        }

        int tmp=0;
        for (int i=0; i<n; i++) {
            System.out.print("Nhap so: ");
            try {
                tmp = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input error!");
                break;
            }

            if (tmp%fizz == 0 && tmp%buzz == 0) {
                System.out.println("FizzBuzz.");
                continue;
            }
            if (tmp%fizz == 0) {
                System.out.println("Fizz.");
                continue;
            }
            if (tmp%buzz == 0) {
                System.out.println("Buzz.");
                continue;
            }

            System.out.println("Not Fizz or Buzz at all!");
            
        }

        scanner.close();
        return;
    }
}