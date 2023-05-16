package basicJAVA;
import java.util.Scanner;
public class ActivitySuggester {
    public static void main(String[] args){

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }
        if(5<=heat && heat <= 15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
        if(10<=heat && heat <= 25){
            System.out.println("Piknik Yapabilirsiniz.");
        }
        if(heat >= 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
