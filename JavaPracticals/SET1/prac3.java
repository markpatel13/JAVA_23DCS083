

import java.util.Scanner;

public class prac3 {

    public static void main(String[] args) {
        System.out.println("Enter the Distace in meters");
        Scanner sc = new Scanner(System.in);

        float distance = sc.nextFloat();
        //char ch=sc.next();
        System.out.println("Enter the time in hour");
        float hour = sc.nextFloat();

        System.out.println("Enter the time in minutes");
        float minutes = sc.nextFloat();

        System.out.println("Enter the time in second");
        float seconds = sc.nextFloat();

        System.out.println("speed in meter per second i.e m/s " + distance / (hour * 3600 + minutes * 60 + seconds));
        System.out.println("speed in kilometer per hour i.e. km/hr " + distance / (1000 * (hour + minutes / 60 + seconds / 3600)));
        System.out.println("speed in meter per second i.e mile/hr " + distance / (1609 * (hour + minutes / 60 + seconds / 3600)));
        System.out.println("23DCS083_Mark_Patel");
    }
}
