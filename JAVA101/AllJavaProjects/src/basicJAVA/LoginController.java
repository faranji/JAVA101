package basicJAVA;
import java.util.Scanner;
public class LoginController {
    public static void main (String[] args){
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("Simon") && password.equals("quoetyu00")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış !");
        }

    }
}
