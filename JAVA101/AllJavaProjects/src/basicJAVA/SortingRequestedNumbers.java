package basicJAVA;
import java.util.Scanner;
public class SortingRequestedNumbers {
    public static void main (String[] args){

        // Değişkenlerimizin türlerini belirttik.
        int inp, biggestNum, smallestNum;

        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);
        
        //  Kullanıcıdan verileri istedik.
        System.out.print("Kaç tane sayı gireceksiniz: ");
        inp = input.nextInt();

        int[] request = new int[inp];  
        biggestNum = Integer.MIN_VALUE; // you want to make sure that the initial value of biggestNum is smaller than any of the user input values.
        smallestNum =Integer.MAX_VALUE;

        // Sıralanacak sayıları tek tek isteyen döngü
        for(int i=0; i < inp ; i++ ){
            System.out.print( (i+1)+ ". sayıyı giriniz: ");
            // added the numbers to request array
            request[i] = input.nextInt();
            
            // her eklenen değerde sayı biggestNum ve smallestNum değerleriyle karşılaştırılır ve daha büyükse biggestNum'a daha küçükse smallestNum'a atanır.
            if( request[i] >= biggestNum){
                biggestNum = request[i];
            } else if(request [i] <= smallestNum){
                smallestNum = request[i]; //neden == değil?
            }
        }


        // En büyük ve en küçük sayı yazdırılır.
        System.out.println("En büyük sayı: " + biggestNum);
        System.out.println("En küçük sayı: " + smallestNum);


    }
}
