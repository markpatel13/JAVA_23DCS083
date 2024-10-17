import java.util.Scanner;

public class prac9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String st = sc.nextLine();
        double_char(st);
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");
    }
    public static void double_char(String st){
        for(int i=0;i<st.length();i++){
            System.out.print(st.charAt(i));
            System.out.print(st.charAt(i));
        }
    }
}

