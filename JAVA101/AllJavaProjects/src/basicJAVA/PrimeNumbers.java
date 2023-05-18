package basicJAVA;

public class PrimeNumbers {
    public static void main(String[] args){

        for(int i=2; i<=100;i++){
            int control = 1;
            for(int j=2; j<=i; j++){
                if(i%j==0 && j!=i){
                    control = 5;
                     break;
                }
            }
            if(control == 1){
                System.out.print(i + " ");
            }
        }

    }
}
