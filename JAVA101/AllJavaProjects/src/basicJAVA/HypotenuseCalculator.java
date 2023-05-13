package basicJAVA;
import java.util.Scanner;

public class HypotenuseCalculator {
        public static void main(String[] args){
            int a, b;
            double c;

            Scanner input = new Scanner(System.in);

            System.out.print("1.kenarı giriniz: ");
            a = input.nextInt();

            System.out.print("2.kenarı giriniz: ");
            b = input.nextInt();

            c = Math.sqrt((a*a) + (b*b));

            System.out.println("Hipotenüs uzunluğu: " + c);

            System.out.println("Alanını öğrenmek istediğiniz üçgenin kenar uzunluklarını giriniz.");
            int d= input.nextInt();
            int e= input.nextInt();
            int f= input.nextInt();

            float u = (d+e+f)/2;
    

        }  
}
