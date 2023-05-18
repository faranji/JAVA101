package basicJAVA;

public class PrimeNumbers {
    public static void main(String[] args){
        
        for(int i=2; i<=100;i++){
            int control = 1;
            for(int j=2; j<=i; j++){
                // Kendisi dışında bir sayıya bölünüyorsa control değişkenine 5 değerini atar.
                if(i%j==0 && j!=i){
                    control = 5;
                     break;
                }
            }
            // Control değerine 5 atanmamış sayıları (asal sayıları) yazdırır.
            if(control == 1){
                System.out.print(i + " ");
            }
        }

    }
}
