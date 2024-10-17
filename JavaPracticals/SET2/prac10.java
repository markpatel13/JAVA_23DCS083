import java.util.*;
public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String ");
        String st=sc.nextLine();
        StringBuffer s=new StringBuffer(st);
        System.out.println("length of String is " +st.length());
        System.out.println("Lowercase of String is " +st.toLowerCase());
        System.out.println("Uppercase of String is " +st.toUpperCase());
        System.out.println("Reverse of String is " +s.reverse());
        char [] arr = st.toCharArray();
        Arrays.sort(arr);
        String temp = new String (arr);
        System.out.println("Sorted string is " + temp);
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");
       

    }
    
}
