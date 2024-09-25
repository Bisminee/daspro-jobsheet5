import java.util.Scanner;
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day;
        String dayType;

        System.out.print("Input day number: ");
        day = sc.nextInt();

        if (day > 0 && day <= 5){

            dayType = "Weekday";
        }else if(day == 6 || day == 7){
            dayType = "Weekend";
        }else{
            dayType = "Invalid Number for day!";
        }

        System.out.println(day + " is a " + dayType);
    }
    
}