import java.util.*;
import javax.swing.*;

public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the string");
        String st = sc.nextLine();
        System.out.println("enter the number");
        int n = sc.nextInt();
        front_times(st, n);
        System.out.println();
        System.out.println("23DCS083_Mark_Patel");

    }


public static void front_times(String st, int n) {
    for (int i = 0; i < n; i++) {
        System.out.print(st.substring(0, 3));
    }
}
}
