package basicJAVA;
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args){
        int sum=0, gir, bolum, basamakSayisi=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        gir = input.nextInt();

        int originalNumber = gir;

        do {
            basamakSayisi++;
            gir /= 10;
        } while(gir> 10);

        gir = originalNumber;

        for(int i = 1 ; i <= basamakSayisi; i++){
            int kalan = gir % 10;
            gir /= 10 ;
            sum += Math.pow(kalan, basamakSayisi);
        }

        if(sum == originalNumber){
            System.out.println(gir + "is an Armstrong number.");
        }else{
            System.out.println(gir + "is not an Armstrong number.");
        }

    }
}
