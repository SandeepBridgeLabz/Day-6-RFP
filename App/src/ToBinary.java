import java.util.Scanner;

public class ToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String binary = String.format("%32s",
                        Integer.toBinaryString(num))
                .replace(' ', '0');

        System.out.println(binary);
    }
}