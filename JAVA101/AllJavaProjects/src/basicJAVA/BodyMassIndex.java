package basicJAVA;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        // height ve weight değişkenlerinin türlerini belirttik.
        float boy, kilo;
        
        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);
        
        //  Kullanıcıdan verileri istedik.
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextFloat();

        // Vücut kitle endeksini hesaplayıp yazdırdık.
        System.out.println("Vücut kitle endeksiniz: " + kilo/boy*boy);
       
        
     }
}
