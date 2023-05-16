package basicJAVA;
import java.util.Scanner;
public class CalculatorMachine {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int n1, n2, select;
        float result= 0;
        
        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);
        
        //  Kullanıcıdan verileri istedik.
        System.out.print("İlk Sayıyı Giriniz: ");
        n1= input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2= input.nextInt();

        // Kullanıcıya yapılacak işlemi seçtirdik.
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        // 1 işlemi toplama, 2 işlemi çıkarma, 3 işlemi çarpma, 4 işlemi bölme olacak şekilde switch case yapısını oluşturduk.
        switch(select){
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = (float) n1/n2;
                break;
        }

        // Sonucu yazdırdık.
        System.out.println("Sonuc: " + result);

    }
}
