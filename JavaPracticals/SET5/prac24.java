import java.util.*;

public class prac24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter first number:");
            int a = sc.nextInt();
            System.out.print("Enter Second number:");
            int b = sc.nextInt();
            int data = a/b;
            System.out.println(data);
        }
        catch(InputMismatchException e){
            System.out.println("the number is non-integer");
        }
        catch(Exception e){
            System.out.println("Any number is not divisible by 0");
        }
        finally{
            sc.close();
            System.out.println("23DCS083_MARK");
        }
    }
}
