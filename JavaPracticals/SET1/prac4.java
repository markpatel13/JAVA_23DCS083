import java.util.*;
public class prac4 {
    public static void main(String[] args) {
       
        int total=0;
        System.out.println("enter your number of expenses");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];//you have to dynamically intialise it just like this
        for(int i=0;i<n;i++){
            System.out.println("Enter your " + (i+1) +" expense ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            total+=arr[i];
        }

        System.out.println("So your tottal Expenses are : " + total);
        System.out.println("23DCS083_MARK_PATEL");
    }
    
    
}
