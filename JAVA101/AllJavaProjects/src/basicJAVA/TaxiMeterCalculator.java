package basicJAVA;
import java.util.Scanner;

public class TaxiMeterCalculator {
    public static void main (String[] args){
        // başlangıç değeri ve kilometre değişkenlerinin türlerini belirttik ve başlangıç ücretine 10 değerini atadık.
        int startingFee = 10;
        float kilometers;

        //Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Kac km gittiniz? : ");
        kilometers =input.nextFloat();

        // gidilen mesafe başına 2.20 TL ve başlangıç değerini ekleyerek toplam ödenecek miktarı price adlı değişkene atadık.
        float price = (float)(10 + (kilometers * 2.20));

        // price değişkeni 20'den küçükse bile müşteri 20 TL ödemek zorunda.
        if(price <=20.0f){
            price = 20.0f;
        }else{
            price = price;
        }
        
        // Ödenecek miktarı yazdırdık.
        System.out.println("odenecek miktar " + price);
    } 
}
