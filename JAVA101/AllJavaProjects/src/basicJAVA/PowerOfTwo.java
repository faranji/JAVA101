package basicJAVA;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num= input.nextInt();

        System.out.print("Girilen sayıdan küçük 4'ün kuvveti sayılar: ");
        for(int i=1; i<=num;i*=4){
            System.out.print(i + " ");
            }
        System.out.println();

        System.out.print("Girilen sayıdan küçük 5'in kuvveti sayılar: ");
        for(int i=1; i<=num;i*=5){
            System.out.print(i + " ");
        }

    }

}
