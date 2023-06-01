import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double z = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * x), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * x), 2);
        double y = 0.25 - 0.25 * Math.sin(((5 * Math.PI / 2) - 8 * x));
        System.out.printf("%.5f %.5f", z, y);
    }
}


