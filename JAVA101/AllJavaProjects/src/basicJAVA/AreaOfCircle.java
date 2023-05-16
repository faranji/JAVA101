package basicJAVA;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Değişkenlerimizin türlerini belirttik.
        int radius;
        double pi = 3.14;

        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Yarıçap değerini giriniz: ");
        radius = input.nextInt();

        // Alınan değerlerle formülden yararlanarak çemberin alanı ve çevresini hesapladık.
        System.out.println("Çemberin alanı: " + pi*radius*radius);
        System.out.println("Çemberin çevresi: " + 2*pi*radius);

        // Kullanıcıdan verileri istedik.
        System.out.print("Merkez aci giriniz: ");
        int centerAngle = input.nextInt();
        
        // Alınan merkez açıyla formülden yararlanarak bir dilimin alanını bulduk.
        System.out.println("Dilimin alani: " + pi*(radius*radius)* centerAngle/360);


    }
}
