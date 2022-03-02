import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int unit = scanner.nextInt();
        final int noArmy = 1;
        final int pack = 19;
        final int throng = 249;
        final int zounds = 999;

        if (unit < noArmy) {
            System.out.println("no army");
        } else if (unit <= pack) {
            System.out.println("pack");
        } else if (unit <= throng) {
            System.out.println("throng");
        } else if (unit <= zounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
