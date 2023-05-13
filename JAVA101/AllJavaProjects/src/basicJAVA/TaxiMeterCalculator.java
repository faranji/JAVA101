package basicJAVA;
import java.util.Scanner;

public class TaxiMeterCalculator {
    public static void main (String[] args){
        int startingFee = 10;
        float kilometers;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac km gittiniz? : ");
        kilometers =input.nextFloat();

        float odenek = (float)(10 + (kilometers * 2.20));

        if(odenek <=20.0f){
            odenek = 20.0f;
        }else{
            odenek = odenek;
        }
        System.out.println("odenecek miktar " + odenek);
    } 
}
