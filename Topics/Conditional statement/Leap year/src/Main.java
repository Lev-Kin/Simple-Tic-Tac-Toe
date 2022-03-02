import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int year = scanner.nextInt();

        final int zero = 0;
        final int four = 4;
        final int hundred = 100;
        final int fourHundred = 400;

        boolean condition = year % four == zero
                && year % hundred != zero
                || year % fourHundred == zero;

        if (condition) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}