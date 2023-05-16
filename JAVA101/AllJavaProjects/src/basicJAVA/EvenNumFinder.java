package basicJAVA;
import java.util.Scanner;
public class EvenNumFinder {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        num = input.nextInt();

        System.out.println("Girdiğiniz sayıya kadar olan çift sayılar: ");
        for(int i=0; i<= num; i++){
            if(i%2!=0){
                continue;
            }
            if(i == num || i== (num-1)){
                System.out.println(i);
                continue;
            }
            System.out.print(i + ",");

        }

    }
}
