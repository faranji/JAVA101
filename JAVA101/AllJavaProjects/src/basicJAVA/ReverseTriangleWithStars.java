package basicJAVA;
import java.util.Scanner;
public class ReverseTriangleWithStars {
    public static void main(String[] args){
        int rowNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        rowNumber = input.nextInt();


        // tekrar kendin yapmaya çalış
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
