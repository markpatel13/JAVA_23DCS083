import java.util.*;
interface AdvanceArithmatic {
    public int divisors_sum(int n);

}

 class calledMyCalculator implements AdvanceArithmatic {
   public int divisors_sum(int n){
        int tot=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                tot=tot+i;
            }
        }
        return tot;
    }
    
}
public class prac22 {
    public static void main(String[] args) {
        calledMyCalculator obj = new calledMyCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DATA :");
        int data=sc.nextInt();
        System.out.println(obj.divisors_sum(data));
    }
    
}
