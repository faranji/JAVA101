package basicJAVA;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){
    
    // Değişkenlerimizin türlerini belirttik.
    int moneyValue; 
    double taxPercent= 1.0;
        
    // Scanner sınıfımızı tanımdalık.    
    Scanner input = new Scanner(System.in);

    //  Kullanıcıdan verileri istedik.
    System.out.print("KDV'li fiyatını öğrenmek istediğiniz para değerini giriniz:  ");
    moneyValue = input.nextInt();
        
   // Para değeri 0-1000 aralığındaysa vergi yüzdesine 0.18, 1000'den büyükse 0.08 değeri atanacak.
    if (0 <= moneyValue && moneyValue < 1000){
          taxPercent = 0.18;
    }else if(moneyValue>=1000){
          taxPercent = 0.08;
    }

    // Vergiyle beraber toplam para değerini priceWithTax adlı değişkene atadık.
    double priceWithTax = ((double)moneyValue * taxPercent) + (double)moneyValue;
    // Vergi miktarını taxValue adlı değişkene atadık.
    double taxValue = (priceWithTax - (double)moneyValue);

    // KDV'li ücreti ve vergi tutarını yazdırdık.
    System.out.println("KDV'li ücret: " + priceWithTax + "TL");
    System.out.println("Vergi Tutarı: " + taxValue + "TL");

    }
}
