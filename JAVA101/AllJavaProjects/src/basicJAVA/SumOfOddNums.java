package basicJAVA;
import java.util.Scanner;
public class SumOfOddNums {
    public static void main(String[] args){
        int num, sum=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        num = input.nextInt();

        for(int i=0; i<=num; i++){
            if(i %2 ==0){
                continue;
            }
            sum += i;
        }

        System.out.println("Toplam: " + sum);
    }
}
