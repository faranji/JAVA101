package basicJAVA;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){
    
    int moneyValue; 
    double taxPercent= 1.0;
    Scanner input = new Scanner(System.in);

    System.out.print("KDV'li fiyatını öğrenmek istediğiniz para değerini giriniz:  ");
    moneyValue = input.nextInt();

    if (0 <= moneyValue && moneyValue < 1000){
          taxPercent = 0.18;
    }else if(moneyValue>=1000){
          taxPercent = 0.08;
    }

    double priceWithTax = ((double)moneyValue * taxPercent) + (double)moneyValue;
    double taxValue = (priceWithTax - (double)moneyValue);

        System.out.println("KDV'li ücret: " + priceWithTax + "TL");
        System.out.println("Vergi Tutarı: " + taxValue + "TL");

    }
}
