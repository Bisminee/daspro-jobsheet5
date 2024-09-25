import java.util.Scanner;
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day;
        String dayType;

        System.out.print("Input day number: ");
        day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:{
                dayType = "Weekday";
            } 
            break;
            case 6:
            case 7:{
                dayType = "Weekend";
            }
            break;
            default:
            dayType = "Invalid Number!";
                break;
        }

        System.out.println(day + " is a " + dayType);
    }
    
}