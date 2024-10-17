//package java_college_pracs;
import java.util.Scanner;
public class prac5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        float[] arr2={100,200,300,400,500};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("The price  of motor with tax are "+ (arr2[0]+arr2[0]*0.08f));
            break;
            
            case 2:
            System.out.println("The price of fan with tax are "+ (arr2[1]+arr2[1]*0.12f));
            break;

            case 3:
            System.out.println("The price of tube with tax are "+ (arr2[2]+arr2[2]*0.05f));
            break;

            case 4:
            System.out.println("The price of wires with tax are "+ (arr2[3]+arr2[3]*0.075f));
            break;

            case 5:
            System.out.println("The price of other items with tax are "+ (arr2[4]+arr2[4]*0.03f));
            break;

            default:
            System.out.println("SORRY!");

        }
        sc.close();
        System.out.println("23DCS083_MARK_PATEL");
    }
    
}
