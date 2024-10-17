import java.util.Scanner;

class Area{
    int length;
    int breadth;

    Area(){
        
    }
    Area(int x,int y){
        length=x;
        breadth=y;
    }
    int return_area(){
        return length*breadth;
    }
}
public class prac15 {
    public static void main(String[] args) {
        int len,bre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        len=sc.nextInt();

        System.out.println("Enter the breadth:");
        bre=sc.nextInt();

        Area ob = new Area(len,bre);
        int res = ob.return_area();
        System.out.println("rectangle area is " +res);
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");

    }
}
