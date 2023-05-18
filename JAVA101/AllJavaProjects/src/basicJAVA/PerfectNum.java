package basicJAVA;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args){
        int perfectNumber =0, toplam =0;
//YANLIŞLIK OLABİLİR!! DİKKAT 0 VE 1 DEĞERLERİ DOĞRU MU BİLMİYORUM.
        Scanner input = new Scanner (System.in);

        while(perfectNumber >= 0) {
            System.out.print("Bir sayı giriniz: ");
            perfectNumber = input.nextInt();

            if (perfectNumber < 0) {
                break; // Exit the loop if the number is negative
            }

            for (int i = 1; i < perfectNumber; i++) {
                if (perfectNumber % i == 0) {
                    toplam += i;
                }
            }

            System.out.print(perfectNumber + " ");
            System.out.println((perfectNumber == toplam) ? "Mükemmel sayıdır." : "Mükemmel sayı değildir.");
        }

    }
}
