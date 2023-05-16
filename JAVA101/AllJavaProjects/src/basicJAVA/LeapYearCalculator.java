package basicJAVA;
import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        System.out.println((year%4==0)? ((year%100==0)? ((year%400==0)? ((year + " bir artık yıldır !")):((year + " bir artık yıl değildir !"))):(year + " bir artık yıldır !")):(year + " bir artık yıl değildir !"));
    }
}
