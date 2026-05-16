import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double c = sc.nextDouble();

        double epsilon = 1e-15;
        double t = c;

        while(Math.abs(t - c/t) > epsilon * t) {
            t = (c/t + t) / 2.0;
        }

        System.out.println("Square Root: " + t);
    }
}