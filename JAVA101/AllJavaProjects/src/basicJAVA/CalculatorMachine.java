package basicJAVA;
import java.util.Scanner;
public class CalculatorMachine {
    public static void main(String[] args){
        int n1, n2, select;
        float result= 0;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1= input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

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

        System.out.println("Sonuc: " + result);

    }
}
