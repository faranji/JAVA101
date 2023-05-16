package basicJAVA;
import java.util.Scanner;
public class ZodiacSignFinder {
    public static void main(String[] args){
        int birthMonth, birthDay;
        String zodiacSign = "Undefined";
        boolean isError = false;


        Scanner input = new Scanner (System.in);
        System.out.print("Doğum Ayınızı Giriniz: ");
        birthMonth = input.nextInt();
        System.out.print("Doğum Gününüzü Giriniz: " );
        birthDay = input.nextInt();


        switch(birthMonth){
            case 1:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 22){
                        zodiacSign = "Oğlak";
                    }else {
                        zodiacSign = "Kova";
                    }
                }else{
                    isError = true;
                }
                break;

            case 2:
                if(birthDay >= 1 && birthDay <=28){
                    if(birthDay < 20){
                        zodiacSign ="Oğlak";
                    }else {
                        zodiacSign ="Balık";
                    }
                }else{
                    isError = true;
                }
                break;

            case 3:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 21){
                        zodiacSign ="Balık";
                    }else {
                        zodiacSign ="Koç";
                    }
                }else{
                    isError = true;
                }
                break;

            case 4:
                if(birthDay >= 1 && birthDay <=30){
                    if(birthDay < 21){
                        zodiacSign ="Koç";
                    }else {
                        zodiacSign ="Boğa";
                    }
                }else{
                    isError = true;
                }
                break;

            case 5:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 22){
                        zodiacSign ="Boğa";
                    }else {
                        zodiacSign ="İkizler";
                    }
                }else{
                    isError = true;
                }
                break;

            case 6:
                if(birthDay >= 1 && birthDay <=30){
                    if(birthDay < 23){
                        zodiacSign ="İkizler";
                    }else {
                        zodiacSign ="Yengeç";
                    }
                }else{
                    isError = true;
                }
                break;

            case 7:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 23){
                        zodiacSign ="Yengeç";
                    }else {
                        zodiacSign ="Aslan";
                    }

                }else{
                    isError = true;
                }
                break;

            case 8:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 23){
                        zodiacSign ="Aslan";
                    }else {
                        zodiacSign ="Başak";
                    }

                }else{
                    isError = true;
                }
                break;

            case 9:
                if(birthDay >= 1 && birthDay <=30){
                    if(birthDay < 23){
                        zodiacSign ="Başak";
                    }else {
                        zodiacSign ="Terazi";
                    }

                }else{
                    isError = true;
                }
                break;

            case 10:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 23){
                        zodiacSign ="Terazi";
                    }else {
                        zodiacSign ="Akrep";
                    }

                }else{
                    isError = true;
                }
                break;

            case 11:
                if(birthDay >= 1 && birthDay <=30){
                    if(birthDay < 22){
                        zodiacSign ="Akrep";
                    }else {
                        zodiacSign ="Yay";
                    }

                }else{
                    isError = true;
                }
                break;

            case 12:
                if(birthDay >= 1 && birthDay <=31){
                    if(birthDay < 22){
                        zodiacSign ="Yay";
                    }else {
                        zodiacSign ="Oğlak";
                    }

                }else{
                    isError = true;
                }
                break;

            default:
                isError = true;
                break;
        }

        if(isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz. ");
        }else{
            System.out.println("Burcunuz: " + zodiacSign);
        }


    }
}
