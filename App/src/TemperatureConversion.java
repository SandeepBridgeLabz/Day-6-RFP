import java.util.Scanner;

public class TemperatureConversion {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = sc.nextInt();

        if(choice == 1) {
            double c = sc.nextDouble();
            System.out.println(celsiusToFahrenheit(c));
        } else {
            double f = sc.nextDouble();
            System.out.println(fahrenheitToCelsius(f));
        }
    }
}