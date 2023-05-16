package basicJAVA;
import java.util.Scanner;
public class PlaneTicketPrice {
   public static void main(String[] args){
      // Değişkenlerimizin türlerini belirttik.
      int distance, age, travelType;
      double price = 10.0, sum = 10.0;
      
      // Scanner sınıfımızı tanımdalık.
      Scanner input = new Scanner(System.in);
      
      // Kullanıcıdan verileri istedik.
      System.out.print("Mesafeyi km türünden giriniz : ");
         distance = input.nextInt();
      System.out.print("Yaşınızı giriniz : ");
         age = input.nextInt();
      System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
         travelType = input.nextInt();

      // Mesafe veya yaş negatifse veya yolculuk tipi 1 veya 2'den farklıysa Hatalı Veri Girdiniz yazdırır.
      if(distance < 0 || age < 0 || (travelType != 1 && travelType != 2)){
         System.out.println("Hatalı Veri Girdiniz!");
      }else {
         // yaş 12'den küçükse %50, 12-24 aralığındaysa %10, 65'ten büyükse %30 indirim uygular.
         if (age < 12) {
            price = (distance * 0.10) - ((distance * 0.10) * 0.50);
         } else if (age < 24) {
            price = (distance * 0.10) - ((distance * 0.10) * 0.10);
         } else if (65 < age) {
            price = (distance * 0.10) - ((distance * 0.10) * 0.30);
         } else {
            price = (distance * 0.10);
         }
      }
      
      // yolculuk tipi 2'yse %20 indirim uygulayıp 2 adet bilet fiyatı keser. Toplam tutarı sum adlı değişkene atadık.
      if(travelType == 2){
         sum = (price - (price * 0.20))*2;
      } else if (travelType == 1) {
         sum = price;
      }

      //Toplam tutarı yazdırdık.
      System.out.println("Toplam Tutar = " + sum);
   
      
      
      
      
 
   }
   
}
