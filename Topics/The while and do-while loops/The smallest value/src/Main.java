import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        long f = 1L;
        int n = 0;
        for (int i = 1; f <= m; i++) {
            f = f * i;
            n = i;
        }

        System.out.println(n);
    }

}