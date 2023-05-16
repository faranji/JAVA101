package basicJAVA;
import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int year;
        
        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        // Yıl 4'e bölünüyorsa 100'e bölünüyor mu diye bakarız. Bölünmüyorsa artık yıldır bölünüyorsa 400'e bölünüyor mu diye bakılır, bölünüyorsa artık yıldır bölünmüyorsa değildir.
        System.out.println((year%4==0)? ((year%100==0)? ((year%400==0)? ((year + " bir artık yıldır !")):((year + " bir artık yıl değildir !"))):(year + " bir artık yıldır !")):(year + " bir artık yıl değildir !"));
    }
}
