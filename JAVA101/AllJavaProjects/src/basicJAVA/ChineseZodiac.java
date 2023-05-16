package basicJAVA;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args){
        // Değişkenlerimizin türlerini belirttik.
        int bornYear;
        String zodiacSign;

        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Doğum Yılınızı Giriniz: ");
        bornYear = input.nextInt();

        // doğum yılının 12 ile bölümünden kalan ile kullanıcının burcunu bulduk.
        switch(bornYear%12){
            case 0:
                zodiacSign = "Maymun";
                break;

            case 1:
                zodiacSign = "Horoz"; 
                break;

            case 2:
                zodiacSign = "Köpek";
                break;

            case 3:
                zodiacSign = "Domuz";
                break;

            case 4:
                zodiacSign = "Fare";
                break;

            case 5:
                zodiacSign = "Öküz";
                break;

            case 6:
                zodiacSign = "Kaplan";
                break;

            case 7:
                zodiacSign = "Tavşan";
                break;

            case 8:
                zodiacSign = "Ejderha";
                break;

            case 9:
                zodiacSign = "Yılan";
                break;

            case 10:
                zodiacSign = "At";
                break;

            case 11:
                zodiacSign = "Koyun";
                break;
            default:
                zodiacSign = "Unsigned";
                break;
        }

        // Çin Zodyağı burcunu atadığımız değişkeni yazdırdık.
        System.out.println("Çin Zodyağı Burcunuz: " + zodiacSign);
    }
}
