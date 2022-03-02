import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int number = scanner.nextInt();

        final int a = -15;
        final int b = 12;
        final int c = 14;
        final int d = 17;
        final int z = 19;

        if (number > a && number <= b) {
            System.out.println("True");
        } else if (number > c && number < d) {
            System.out.println("True");
        } else if (number >= z) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}