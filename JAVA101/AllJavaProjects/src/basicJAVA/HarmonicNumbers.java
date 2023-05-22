package basicJAVA;
import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args){
        int n;
        double sum=0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();

        for(int i=1; i<=n;i++){
            sum += (double)1/i;
        }

        System.out.println("Sonuç :" + sum);
    }
}
