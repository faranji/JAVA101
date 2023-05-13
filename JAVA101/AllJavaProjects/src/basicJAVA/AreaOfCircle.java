package basicJAVA;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap değerini giriniz: ");
        radius = input.nextInt();

        System.out.println("Çemberin alanı: " + pi*radius*radius);
        System.out.println("Çemberin çevresi: " + 2*pi*radius);

        System.out.print("Merkez aci giriniz: ");
        int merkezAci = input.nextInt();
        System.out.println("Dilimin alani: " + pi*(radius*radius)* merkezAci/360);


    }
}
