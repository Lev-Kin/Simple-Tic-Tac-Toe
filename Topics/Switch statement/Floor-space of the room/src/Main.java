import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.next();

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double p = 0.0;
        double r = 0.0;
        double area = 0.0;
        final double pI = 3.14;
        switch (figure) {

            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();

                p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println(area);
                break;

            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();

                area = a * b;
                System.out.println(area);
                break;

            case "circle":
                r = scanner.nextDouble();

                area = pI * (r * r);

                System.out.println(area);
                break;

            default:
                System.out.println("error!");
                break;

        }
    }
}