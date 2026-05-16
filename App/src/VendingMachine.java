import java.util.Scanner;

public class VendingMachine {

    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static void calculate(int amount) {

        int count = 0;

        for(int note : notes) {

            if(amount >= note) {

                int num = amount / note;
                amount = amount % note;

                count += num;

                System.out.println(note + " : " + num);
            }
        }

        System.out.println("Minimum Notes: " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        calculate(amount);
    }
}