package basicJAVA;
import java.util.Scanner;

public class AverageGradePoint {
    public static void main(String[] args){
        
        // Değişkenlerimizin türlerini belirttik.
        int math, physics, chemistry, turkish, history, music;
        
        // Scanner sınıfımızı tanımdalık.
        Scanner inp = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Matematik Notunuz: ");
        math = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        physics = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        chemistry = inp.nextInt(); 

        System.out.print("Türkçe Notunuz: ");
        turkish = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        history = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        music = inp.nextInt();
        
        // Ders notlarının toplamını "sum" adlı değişkene atadık.
        int sum = (math + physics + chemistry + turkish + history + music);
        // sum adlı değişkeni ders sayısına bölerek ortalamayı elde ettik ve onu result adlı değişkene atadık.
        double result = sum/6.0;

        // Ortalamayı atadığımız değişkeni yazdırdık.
        System.out.println("Ortalamanız : " + result);
        
        //Ortalama 60'tan büyükse 'Geçti' değilse 'Geçmedi' yazdırdık.
        System.out.println((result > 60) ? "Geçti" : "Geçmedi");
    }
}
