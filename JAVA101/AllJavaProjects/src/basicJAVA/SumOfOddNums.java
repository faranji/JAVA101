package basicJAVA;
import java.util.Scanner;
public class SumOfOddNums {
    public static void main(String[] args){
        // Değişkenleri tanımladık.
        int num, sum=0;
        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        // Tek sayı girene kadar girilen sayılardan 4'e bölünenleri toplar.
        while(num%2==0){
            System.out.print("Sayı Giriniz: ");
            num = input.nextInt();
            if(num%4==0){
                sum += num;
            }
        }
        
        // Sonucu bastırdık.
        System.out.println("Girdiğiniz sayılardan çift ve 4'ün katı olan sayıların toplamı:  " + sum);

    }
}
