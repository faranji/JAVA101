package basicJAVA;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int perfectNumber =0, toplam =0;

        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner (System.in);

        // Negatif sayı girilene kadar girilen sayının kendisi hariç bölenlerinin toplamını bulan döngü.
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
            // Kendisi hariç çarpanları toplamı, kendisine eşitse "Mükemmel sayıdır" değilse "Mükemmel sayı değildir" yazdırır.
            System.out.println((perfectNumber == toplam) ? "Mükemmel sayıdır." : "Mükemmel sayı değildir.");
        }

    }
}
