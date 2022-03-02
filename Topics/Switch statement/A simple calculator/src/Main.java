import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        final char symbol = scanner.next().charAt(0);
        long b = scanner.nextLong();

        long result = 0L;
        switch (symbol) {

            case '+':
                result = a + b;
                System.out.println(result);
                break;

            case '-':
                result = a - b;
                System.out.println(result);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    result = a / b;
                    System.out.println(result);
                }
                break;

            case '*':
                result = a * b;
                System.out.println(result);
                break;

            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}