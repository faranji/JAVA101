package basicJAVA;
import java.util.Scanner;
public class ActivitySuggester {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int heat;
        
        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        // Sıcaklık 5'ten küçükse, 5-15 aralığındaysa, 10-25 aralığındaysa ve/veya 25'ten büyükse önerilecek aktiviteler yazdırıldı.
        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }
        if(5<=heat && heat <= 15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
        if(10<=heat && heat <= 25){
            System.out.println("Piknik Yapabilirsiniz.");
        }
        if(heat >= 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
