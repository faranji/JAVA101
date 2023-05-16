package basicJAVA;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args){
        int num, factorial=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyelini Hesaplat: ");
        num= input.nextInt();

        for(int i= num; i >= 1; i--){
            factorial *= i;
        }

        System.out.println("Sonuç= " + factorial);
    }
}
