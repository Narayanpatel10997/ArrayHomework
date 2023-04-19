import java.util.Scanner;
public class MultiplicationTableDoWhile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int i = 1;
            do {
                int product = number * i;
                System.out.println(number + " x " + i + " = " + product);
                i++;
            } while (i <= 10);
        }
    }


