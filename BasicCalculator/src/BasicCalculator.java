import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        double numberOne = scanner.nextDouble();

        System.out.print("");
        double numberTwo = scanner.nextDouble();

        System.out.println("possible result:");
        System.out.println("(A)add");
        System.out.println("(S)subtract");
        System.out.println("(M)multiply");
        System.out.println("select option: ");

        char optionChoice = scanner.next().charAt(0);
        double result = 0;

        switch (optionChoice) {
            case 'A':
            case 'a':
                result = numberOne + numberTwo;
                break;
//        System.out.println(numberOne + "+" + numberTwo "=" + result);
            case 'S':
            case 's':
                result = numberOne - numberTwo;
                break;
            case 'M':
            case 'm':
                result = numberOne * numberTwo;
                break;
            case 'D':
            case 'd':
                result = numberOne / numberTwo;

                break;

        }

        System.out.println("Your answer is " + result);
    }
}