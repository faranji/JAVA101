package basicJAVA;
import java.util.Scanner;

public class GroceryCashProgram {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican= 5.00;

        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner (System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Armut Kaç Kilo ?:");
        int armutAdeti = input.nextInt();

        System.out.print("Elma Kaç Kilo ?:");
        int elmaAdeti = input.nextInt();

        System.out.print("Domates Kaç Kilo ?:");
        int domatesAdeti = input.nextInt();

        System.out.print("Muz Kaç Kilo ?:");
        int muzAdeti = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ?:");
        int patlicanAdeti = input.nextInt();

        // Ürün adeti ve ürün fiyatlarını çarparak toplam tutarı elde edip yazdırdık.
        System.out.println("Toplam Tutar : " + ((armut*armutAdeti)+(elma*elmaAdeti)+(domates*domatesAdeti)+(muz*muzAdeti)+(patlican*patlicanAdeti)) + "TL");

    }
}
