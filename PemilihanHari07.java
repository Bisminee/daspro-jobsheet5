import java.util.Scanner;

public class PemilihanHari07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day, dayType;

        System.out.print("Input day name: ");
        day = sc.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":{
                dayType = "Weekday";
            } 
            break;
            case "Sunday":
            case "Saturday":{
                dayType = "Weekend";
            }
            break;
            default:
            dayType = "Invalid Day Name!";
                break;
        }

        System.out.println(day + " is a " + dayType);
    }
}
