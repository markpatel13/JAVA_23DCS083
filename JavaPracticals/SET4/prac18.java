import java.util.Scanner;

class Member{
    String Name;
    int Age;
    long phone_number;
    String address;
    double salary;
    
    void printsalary(){
        System.out.println("your salary is :" +salary);
    }
    
}
class Employee extends Member{
    String specialization;
    void setdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        Name=sc.nextLine();
        System.out.print("Enter your age:");
        Age=sc.nextInt();
        System.out.print("Enter your phone number:");
        phone_number=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your address:");
        address=sc.nextLine();
        // sc.nextLine();
        System.out.print("Enter your salary:");
        salary=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your specialization:");
        specialization=sc.nextLine();
       

    }

    void display(){
        System.out.println("Name           :" +Name);
        System.out.println("Age            :" +Age);
        System.out.println("phone          :" +phone_number);
        System.out.println("address        :" +address);
        System.out.println("specialization :" +specialization);
        printsalary();

    }
}
class Manager extends Member{
    String department;
    void setdata(){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name:");
        Name=sc.nextLine();
        System.out.print("Enter your age:");
        Age=sc.nextInt();
        System.out.print("Enter your phone number:");
        phone_number=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your address:");
        address=sc.nextLine();
        // sc.nextLine();
        System.out.print("Enter your salary:");
        salary=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your department:");
        department=sc.nextLine();
        sc.close();
    }
    void display(){
        System.out.println("Name           :" +Name);
        System.out.println("Age            :" +Age);
        System.out.println("phone          :" +phone_number);
        System.out.println("address        :" +address);
        System.out.println("department     :" +department);
        printsalary();

    }
}
public class prac18 {
    public static void main(String[] args) {
        Employee o1 = new Employee();
        o1.setdata();
        o1.display();
        Manager o2 = new Manager();
        o2.setdata();
        o2.display();

        System.out.println();
        System.out.println("23DCS083_MARK");
    }
}
