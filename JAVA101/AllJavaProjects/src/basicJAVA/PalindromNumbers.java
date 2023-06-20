package basicJAVA;
import java.util.Scanner;
import java.util.Arrays;
public class PalindromNumbers {

    static boolean isPolindrome(int inp) {
        int temp = inp, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(reverseNumber == inp){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int inp = 3;

        Scanner input = new Scanner(System.in);

        while (inp >= 0) {
            System.out.print("Bir sayı giriniz: ");
            inp = input.nextInt();
            if(inp < 0){
                break;
            }

            boolean yesOrNo = isPolindrome(inp);

            if(yesOrNo == true){
                System.out.println(inp + " is a polindrome number");
            }else{
                System.out.println(inp + " is not a polindrome number");
            }



        }
    }
}
