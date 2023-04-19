import java.util.Scanner;
public class ReverseNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a 5-digit number: ");
            int number = input.nextInt();
            int reverse = 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }
            System.out.println("The reversed number is: " + reverse);
        }
    }


