import java.util.Scanner;
public class CountCharacterA {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == 'a') {
                    count++;
                }
            }
            System.out.println("The total number of 'a' characters in the string is: " + count);
        }
    }


