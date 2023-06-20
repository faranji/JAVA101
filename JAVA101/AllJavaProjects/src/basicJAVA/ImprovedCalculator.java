package basicJAVA;
import java.util.Scanner;

public class ImprovedCalculator {

    static void plus(){
            int input, sum=0;
            Scanner scan = new Scanner(System.in);// her fonksiyon için ayrı ayrı scanner sınıfı oluşturmalısın!
            while(true) {
                input = scan.nextInt();
                sum += input;
                if(input==0){
                    break;
                }
            }
        System.out.println("Result: " + sum);
    }
    static int minus(int a , int b){
        return a-b;
    }
    static void multiply(){
        int input, sum=1;
        Scanner scan = new Scanner(System.in);// her fonksiyon için ayrı ayrı scanner sınıfı oluşturmalısın!
        while(true) {
            input = scan.nextInt();
            sum *= input;
            if(input==1){
                break;
            }
        }
        System.out.println("Result: " + sum);
    }
    static float divide(float a , float b){
        return a/b;
    }
    static int pow(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    static int factorial(int a){
        int num = a, result=1;
        for(int i =1; i<=num; i++){
            result*= a;
            a--;
        }
        return result;
    }

    public static void main(String[] args){
        int inp, input1, input2;
        Scanner input = new Scanner(System.in);
        System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme İşlemi\n5- Üslü Sayı Hesaplama\n6- Faktöriyel Hesaplama\n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı\n");
        inp = input.nextInt();

        if(inp==1){
            System.out.println("Toplamak istediğiniz değerleri giriniz:");
            plus();
        } else if (inp==2) {
            System.out.println("Çıkarmak istediğiniz değerleri giriniz:");
            input1 = input.nextInt();
            input2 = input.nextInt();
            System.out.println("Result: "+ minus(input1, input2));
        }else if (inp==3) {
            System.out.println("Çarpmak istediğiniz değerleri giriniz:");
            multiply();
        }else if (inp==4) {
            System.out.println("Bölmek istediğiniz değerleri giriniz:");
            input1 = input.nextInt();
            input2 = input.nextInt();
            System.out.println("Result: "+ divide(input1, input2));
        }else if (inp==5) {
            System.out.println("Taban değerini giriniz:");
            input1 = input.nextInt();
            System.out.println("Üs değerini giriniz:");
            input2 = input.nextInt();
            System.out.println("Result: "+  pow(input1, input2));
        }else if (inp==6) {
            System.out.println("Sayı giriniz:");
            input1 = input.nextInt();
            System.out.println("Result: "+  factorial(input1));
        }else if (inp==7) {
            System.out.println("Modunu alacağınız sayıyı giriniz:");
            input1 = input.nextInt();
            System.out.println("Mod alacak sayıyı giriniz:");
            input2 = input.nextInt();
            System.out.println("Result: " + (input1%input2));
        }else if (inp==8) {
            System.out.println("Birinci kenar değerini giriniz:");
            input1 = input.nextInt();
            System.out.println("İkinci kenar değerini giriniz:");
            input2 = input.nextInt();
            System.out.println("Area: "+ (input1*input2));
            System.out.println("Perimeter: "+ ((2*input1) + (2*input2)));
        }

    }
}
