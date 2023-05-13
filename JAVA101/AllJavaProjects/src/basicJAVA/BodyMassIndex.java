package basicJAVA;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        float boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextFloat();

        System.out.println("Vücut kitle endeksiniz: " + kilo/boy*boy);
       

        
     }
}