package coupon;

import java.util.HashSet;
import java.util.Random;

public class Coupon
{

    public static int generateCoupon()
    {
        Random ran=new Random();
        return 10000+ran.nextInt(90000);
    }

    public  static void printCoupon()
    {
        HashSet<Integer> coupons=new HashSet<>();

        while(coupons.size()<10)
        {
            int coupon= generateCoupon();
            coupons.add(coupon);
        }

        System.out.println("GENERATED UNIQUE 10 COUPON NUMBERS");

        for(int cou : coupons)
        {
            System.out.println(cou);
        }
    }

    public static void main(String[] args)
    {
        Coupon.printCoupon();
    }
}
