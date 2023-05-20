package basicJAVA;
import java.util.Scanner;
public class TriangleWithStars {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int rowNumber;
        
        // Değişkenlerimizin türlerini belirttik.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Kaç satırlık üçgen istiyorsun?");
        rowNumber = input.nextInt();
        
        
        for (int i = 1; i <= rowNumber; i++){
            for(int k= rowNumber-i; k>=0; k--){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
