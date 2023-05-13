package basicJAVA;
import java.util.Scanner;

public class GroceryCashProgram {
    public static void main(String[] args){
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican= 5.00;

        Scanner input = new Scanner (System.in);

        System.out.print("Armut Kaç Kilo ?:");
        int armutAdeti = input.nextInt();

        System.out.print("Elma Kaç Kilo ?:");
        int elmaAdeti = input.nextInt();

        System.out.print("Domates Kaç Kilo ?:");
        int domatesAdeti = input.nextInt();

        System.out.print("Muz Kaç Kilo ?:");
        int muzAdeti = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ?:");
        int patlicanAdeti = input.nextInt();

        System.out.println("Toplam Tutar : " + ((armut*armutAdeti)+(elma*elmaAdeti)+(domates*domatesAdeti)+(muz*muzAdeti)+(patlican*patlicanAdeti)) + "TL");

    }
}
