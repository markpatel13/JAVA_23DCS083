import java.util.Scanner;

class Date{
    int day;
    int month;
    int year;


    Date(){
        day=4;
        month = 9;
        year=2005;

    }

    Date(int x,int y,int z){
        day=x;
        month=y;
        year=z;
    }
    void setdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        day=sc.nextInt();
        System.out.println("Enter the month");
        month=sc.nextInt();
        System.out.println("Enter the year");
        year=sc.nextInt();

    }

    void display(){
        System.out.println( day +"/"+ month + "/"+year);
    }
}
public class prac14 {
    public static void main(String[] args) {
        Date obj = new Date();
        obj.display();
        
        Date obj1 = new Date(13,12,2024);
        obj1.display();
        
        Date obj2 = new Date();
        obj2.setdata();
        obj2.display();
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");


    }
}
