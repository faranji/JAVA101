package basicJAVA;
import java.util.Scanner;
public class SortingRequestedNumbers {
    public static void main (String[] args){


        int inp, biggestNum, smallestNum;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        inp = input.nextInt();

        int[] request = new int[inp];  //onemli!!
        biggestNum = Integer.MIN_VALUE; // you want to make sure that the initial value of biggestNum is smaller than any of the user input values.
        smallestNum =Integer.MAX_VALUE;


        for(int i=0; i < inp ; i++ ){
            System.out.print( (i+1)+ ". sayıyı giriniz: ");
            // add the numbers to request array
            request[i] = input.nextInt();
            if( request[i] >= biggestNum){
                biggestNum = request[i];
            } else if(request [i] <= smallestNum){
                smallestNum = request[i]; //neden == değil?
            }
        }


        System.out.println("En büyük sayı: " + biggestNum);
        System.out.println("En küçük sayı: " + smallestNum);


    }
}
