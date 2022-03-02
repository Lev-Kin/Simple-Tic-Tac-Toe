import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money;
        double percent;
        double needMoney;

        money = scanner.nextDouble();
        percent = scanner.nextDouble();
        needMoney = scanner.nextDouble();

        int takeYears = 0;
        final int hundred = 100;
        while (money < needMoney) {
            money = money + money * (percent / hundred);
            takeYears++;
        }

        System.out.println(takeYears);
    }
}