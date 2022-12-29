import java.util.Locale;
import java.util.Scanner;
public class horoscope {
    public static void main(String[] args) {



        int birthDay;
        String month;
        String horoscope = "";
        boolean isError = false;


        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Birthday : ");
        birthDay = input.nextInt();

        System.out.print("Please Enter Your Birthmonth : ");
        input.nextLine();
        month = input.nextLine();
        month = month.toUpperCase();


        if (month.equals("JANUARY")) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 22) {
                    horoscope = "Aquarius.";

                } else {
                    horoscope = "Capricorn.";
                }
            }else {
                isError = true;
        }
        }

        if (month.equals("FEBRUARY")) {
            if (birthDay >= 1 && birthDay <= 28) {
                if (birthDay <= 19) {
                    horoscope = "Aquarius.";
                } else {
                    horoscope = "Pisces.";
                }
            }else {
                isError = true;
        }
        }

        if (month.equals("MARCH")) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21) {
                    horoscope = "Aries";
                } else {
                    horoscope = "Pisces.";
                }
            }else {
                isError = true;
        }
        }
        if (month.equals("APRİL")){
            if(birthDay >= 1 && birthDay >= 30){
                if(birthDay <= 20){
                    horoscope = "Aries.";
                }else{
                    horoscope = "Taurus.";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("MAY")){
            if(birthDay >=1 && birthDay <= 31){
                if(birthDay >= 22){
                    horoscope = "Gemini.";
                }else {
                    horoscope = "Taurus.";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("JUNE")){
            if(birthDay >=1 && birthDay <= 30){
                if(birthDay >= 23){
                    horoscope = "Cancer";
                }else {
                    horoscope = "Gemini";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("JULY")){
            if(birthDay >=1 && birthDay <= 31){
                if(birthDay <= 22){
                    horoscope = "Cancer.";
                }else{
                    horoscope = "Leo";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("AUGUST")){
            if(birthDay >= 1 && birthDay <= 31){
                if(birthDay <=22 ){
                    horoscope = "Leo.";
                }else {
                    horoscope = "Virgo.";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("SEPTEMBER")){
            if(birthDay >= 1 && birthDay <= 30){
                if(birthDay <= 22){
                    horoscope = "Virgo";
                }else {
                    horoscope = "Libra.";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("OCTOBER")){
            if(birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 22){
                    horoscope = "Libra.";
                }else {
                    horoscope = "Scorpio.";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("NOVEMBER")){
            if(birthDay >= 1 && birthDay <= 30){
                if(birthDay <= 21){
                    horoscope = "Scorpio.";
                }else {
                    horoscope = "Sagittarius.";
                }
            }else {
                isError = true;
        }
        }

        if(month.equals("DECEMBER")){
            if(birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 21 ){
                    horoscope = "Sagittarius.";
                }else {
                    horoscope = "Capricorn.";
                }

            }else {
                isError = true;
        }

        }


        if (isError) {
            System.out.println("Please check the date.");
        } else {
            System.out.println("Your zodiac sign: : " + horoscope);
        }
    }
}

