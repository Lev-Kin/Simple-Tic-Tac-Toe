import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int number = scanner.nextInt();

        final int ten = 10;
        final int hundred = 100;
        final int thousand = 1000;
        final int tenThousand = 10000;

        final int digit1 = number % ten;
        final int digit2 = (number % hundred - digit1) / ten;
        final int digit3 = (number % thousand - digit2) / hundred;
        final int digit4 = (number % tenThousand - digit3) / thousand;

        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }
}