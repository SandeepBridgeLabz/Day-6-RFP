import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Press Enter to Start");
        sc.nextLine();

        long start = System.currentTimeMillis();

        System.out.println("Press Enter to Stop");
        sc.nextLine();

        long end = System.currentTimeMillis();

        long elapsed = end - start;

        System.out.println("Elapsed Time: " + elapsed + " milliseconds");
    }
}