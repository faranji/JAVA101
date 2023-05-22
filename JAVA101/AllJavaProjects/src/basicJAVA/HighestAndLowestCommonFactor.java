package basicJAVA;
import java.util.Scanner;

public class HighestAndLowestCommonFactor {
    public static void main(String[] args) {
        int num1, num2;
        int hcf = 1, lcf;
        int i=1;
        Scanner input = new Scanner(System.in);

        System.out.print("İki sayı giriniz: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > num2) {
            while (i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
                i++;
            }
        } else if (num2 > num1) {
            while (i <= num1) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
                i++;
            }
        } else {
            hcf = num1;
        }


        lcf = (num1 * num2)/hcf;

        System.out.println("EBOB: " + hcf);
        System.out.println("EKOK: " + lcf);

    }
}
