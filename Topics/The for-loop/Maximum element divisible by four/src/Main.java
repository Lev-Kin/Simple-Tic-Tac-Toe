import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int four = 4;

        final int n = scanner.nextInt();

        int max = -1;
        for (int i = 0; i < n; i++) {

            int number = scanner.nextInt();

            if (number % four == 0 && max < number) {
                max = number;
            }
        }

        System.out.println(max);

    }
}