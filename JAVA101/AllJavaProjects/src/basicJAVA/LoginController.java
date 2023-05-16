package basicJAVA;
import java.util.Scanner;
public class LoginController {
    public static void main (String[] args){
        // Değişkenlerimizin türlerini belirttik.
        String userName, password;

        // Scanner sınıfımızı tanımdalık.
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan verileri istedik.
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        // kullanıcı adı ve şifre doğruysa Giriş Yaptınız ! değilse Bilgileriniz Yanlış ! yazdırır.
        if(userName.equals("Simon") && password.equals("quoetyu00")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış !");
        }

    }
}
