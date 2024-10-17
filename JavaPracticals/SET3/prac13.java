// import java.util.Scanner;
// class Employees{
    
//     String firstname;
//     String lastname;
//     double salary;
//     Scanner sc = new Scanner(System.in);
//      Employees(){
//         firstname="HELLO";
//         lastname = "hi";
//         salary = 0;

//     }

//      void setdata() {
        
//         System.out.println("Enter your first name :");
//         firstname = sc.nextLine();
//         System.out.println("Enter your last name :");
//         lastname = sc.nextLine();
//         System.out.println("Enter your salary :");
//         salary = sc.nextInt();

//         if(salary<0){
//             salary=0.0;
//         }
//         else{

//         }

//     }

//      void display() {
//         double realsal=setSalary();
//         System.out.println("the salary of " +firstname+ " " +lastname + " is " +realsal);


//     }

//      double setSalary(){

//         return ((salary * 12) + (salary*0.10*12));
//     }

// }
// public class prac13 {
    
    

//     public static void main(String[] args) {
//         int number;
//         // prac13 obj = new prac13();
//         // obj.setdata();
//         // obj.display();
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter total number of Employees :");
//         number=s.nextInt();
//         Employees[] emp = new Employees[number];
//         for(int i=0;i<number;i++){
//             emp[i].setdata();
//         }
//         for(int i=0;i<number;i++){
//             emp[i].display();
//         }



//     }

// }


import java.util.Scanner;

class Employees {
    String firstname;
    String lastname;
    double salary;
    Scanner sc = new Scanner(System.in);

    Employees() {
        firstname = "HELLO";
        lastname = "hi";
        salary = 0;
    }

    void setdata() {
        System.out.println("Enter your first name:");
        firstname = sc.nextLine();
        System.out.println("Enter your last name:");
        lastname = sc.nextLine();
        System.out.println("Enter your monthly salary:");
        salary = sc.nextDouble();
        sc.nextLine();  // consume the leftover newline

        if (salary < 0) {
            salary = 0.0;
        }
    }

    void display() {
        double realsal = setSalary();
        System.out.println("The salary of " + firstname + " " + lastname + " with 10% raise is " + realsal);
    }

    double setSalary() {
        return ((salary * 12) + (salary * 0.10 * 12));
    }
}

public class prac13 {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total number of Employees:");
        number = s.nextInt();
        s.nextLine();  // consume the leftover newline

        Employees[] emp = new Employees[number];
        for (int i = 0; i < number; i++) {
            emp[i] = new Employees();  // instantiate each Employees object
            emp[i].setdata();
        }
        for (int i = 0; i < number; i++) {
            emp[i].display();
        }
        System.out.println("23DCS083_MARK_PATEL");
        s.close();  // close the Scanner object
    }
}
