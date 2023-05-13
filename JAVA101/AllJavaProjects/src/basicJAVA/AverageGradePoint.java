package basicJAVA;
import java.util.Scanner;

public class AverageGradePoint {
    public static void main(String[] args){
        
        int math, physics, chemistry, turkish, history, music;
        Scanner inp = new Scanner(System.in);

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

        int sum = (math + physics + chemistry + turkish + history + music);
        double result = sum/6.0;

        System.out.println("Ortalamanız : " + result);
        System.out.println((result > 60) ? "Geçti" : "Geçmedi"); //result değişkenimiz yani ortalamamız 60'tan büyükse Geçti değilse Geçmedi yazar ekrana.
    }
}
