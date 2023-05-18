package basicJAVA;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        int elementNum;
        int firstElement=0, secondElement=1, sum;
        sum = firstElement + secondElement;

        Scanner input= new Scanner(System.in);

        System.out.print("Dizi kaç elemanlı olsun?: ");
        elementNum = input.nextInt();

        System.out.print(firstElement + " ");
        System.out.print(secondElement + " ");
        for(int i=0; i<=elementNum-3; i++){
            System.out.print(sum+ " ");
            firstElement = secondElement;
            secondElement = sum;
            sum = firstElement + secondElement;
        }
    }
}
