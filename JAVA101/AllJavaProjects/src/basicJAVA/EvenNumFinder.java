package basicJAVA;
import java.util.Scanner;
public class EvenNumFinder {
    public static void main(String[] args){
        int num;
        float sum=(float) 0, custom=(float) 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        num = input.nextInt();


        for(int i=0; i<= num; i++){
            if(i%3==0){
                sum+=i;
                custom ++;
            } else if (i%4==0) {
                sum+=i;
                custom ++;
            }
        }

        System.out.println("Ortalama: " + sum/custom);

    }
}
