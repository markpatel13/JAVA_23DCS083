import java.util.Scanner;

public class prac25 {

    public static void main(String[] args) {

        int balance = 5000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount to withdraw");

        int withdraw = sc.nextInt();

        try {

            if (balance - withdraw < 1000) {

                throw new Exception("Your WithDraw amount is Greater than your Balance");

            }

            else {

                balance = balance - withdraw;

            }

        } 
        catch (Exception e) {

            e.printStackTrace();
         

        }
        finally{
            System.out.println("Available balance :"+balance);
            System.out.println("23DCS083_MARK");
        }
    }

}
