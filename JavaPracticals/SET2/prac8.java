
import java.util.Scanner;

public class prac8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no. of elements ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elenemt no " +(i+1) +" :");

            arr[i]=sc.nextInt();
        }
        array_count9(arr);
        sc.close();
        System.out.println("23DCS083_Mark_patel");

    }

    public static void array_count9(int []arr){
        int count=0;
        //int c =arr.length();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==9){
                count++;
            }
            

        }
       System.out.println("The total count of 9's are " +count);
    }
}
