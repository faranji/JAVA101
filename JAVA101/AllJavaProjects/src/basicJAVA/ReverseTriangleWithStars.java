package basicJAVA;
import java.util.Scanner;
public class ReverseTriangleWithStars {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int rowNumber;
        
        // Değişkenlerimizin türlerini belirttik.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Satır sayısını giriniz: ");
        rowNumber = input.nextInt();

        // Ters piramit yazdıran döngü.
        for(int i=1; i<=rowNumber; i++){
            for(int k=1; k<=i-1; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= 2*rowNumber - i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
