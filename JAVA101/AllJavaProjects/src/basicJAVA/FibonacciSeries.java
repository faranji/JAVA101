package basicJAVA;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int elementNum;
        int firstElement=0, secondElement=1, sum;
        sum = firstElement + secondElement;

        // Scanner sınıfımızı tanımdalık.
        Scanner input= new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Dizi kaç elemanlı olsun?: ");
        elementNum = input.nextInt();

        // İlk iki elemanı yazdırdık.
        System.out.print(firstElement + " ");
        System.out.print(secondElement + " ");
        
        // İlk elemanı ikinciye, ikinciyi toplama, toplamı da birinciyle ikincinin toplamına atayan döngü.
        for(int i=0; i<=elementNum-3; i++){
            System.out.print(sum+ " ");
            firstElement = secondElement;
            secondElement = sum;
            sum = firstElement + secondElement;
        }
    }
}
