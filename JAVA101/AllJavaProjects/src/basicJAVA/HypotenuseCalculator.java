package basicJAVA;
import java.util.Scanner;

public class HypotenuseCalculator {
        public static void main(String[] args){
            // Değişkenlerimizin türlerini belirttik.
            int a, b;
            double c, area;

            // Scanner sınıfımızı tanımdalık.
            Scanner input = new Scanner(System.in);

            //  Kullanıcıdan verileri istedik.
            System.out.print("1.kenarı giriniz: ");
            a = input.nextInt();

            System.out.print("2.kenarı giriniz: ");
            b = input.nextInt();
        
            // Hipotenüsü (a^2 + b^2)'nin karekökünü Math metodu yardımıyla hesapladık.
            c = Math.sqrt((a*a) + (b*b));
                
            // Hesapladığımız hipotenüs değerini yazdırdık.
            System.out.println("Hipotenüs uzunluğu: " + c);
                
            // girilen kenar uzunluklarını toplayıp ikiye bölerek u adlı değişkene atadık.
            float u = (float) (a+b+c)/2;
                
            // u ve kenarlarla verilen formülü kullanarak alanı hesaplayıp area adlı değişkene atadık.
            area = (float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
              
            // Hesapladığımız alan değerini yazdırdık.
            System.out.println("Alanı: " + area);

    

        }  
}
