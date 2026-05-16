import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    public static int generateCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        while(set.size() < n) {
            int coupon = generateCoupon(n);
            set.add(coupon);
            count++;
        }

        System.out.println("Total Random Numbers Needed: " + count);
    }
}