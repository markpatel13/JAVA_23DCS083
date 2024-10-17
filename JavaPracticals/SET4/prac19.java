// import java.util.Scanner;

// class Rectangle{
//     int length;
//     int breadth;

//     Rectangle(){

//     }
//     Rectangle(int a,int b){
//         length=a;
//         breadth=b;
//     }
//     void print_area_rectangle(){
//         System.out.println("The area of rectangle is:" +length*breadth);
//     }
//     void print_perimeter_rectangle(){
//         System.out.println("The perimeter of rectangle is:"+(2*(length+breadth)));
//     }
// }
// class Square extends Rectangle{
//     int l;
//     Square(){

//     }
//     Square(int x){
//         // System.out.println("HO");
//         super(x,x);
//       
//     }
//     void print_area_square(){
//         System.out.println("The area of square is :"+(l*l) );
//     }
//     void print_perimeter_square(){
//         System.out.println("The perimeter of square is:"+(2*(l+l)));
//     }
// }
// public class prac19 {
//  public static void main(String[] args) {
//     Square[] ob = new Square[3];
//     ob[0]=new Square(5,2,5);
//     ob[1]=new Square(5,2,5);
//     ob[2]=new Square(5,2,5);

//     for(int i=0;i<ob.length;i++){
//         System.out.println("---------------------------------------------");
//         ob[i].print_area_rectangle();
//         ob[i].print_area_square();
//         ob[i].print_perimeter_rectangle();
//         ob[i].print_perimeter_square();
    
//     }
   
// }


// }



// public class Student {
//     String name;
//     int age;

//     // Constructor
//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Method to display student details
//     public void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         // Creating an array of Student objects
//         Student[] students = new Student[3];

//         // Initializing the array elements
//         students[0] = new Student("Alice", 20);
//         students[1] = new Student("Bob", 22);
//         students[2] = new Student("Charlie", 21);

//         // Displaying the student details
//         for (int i = 0; i < students.length; i++) {
//             students[i].display();
//         }
//     }
// }

import java.util.*;
class Rectangle
{
    float Length;
    float Breadth;

    public Rectangle()
    {
        Length = 0;
        Breadth = 0;
    }

    public Rectangle(float Length,float Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    void Perimeter()
    {
        System.out.println("\nPerimeter of Rectangle is : " + 2*(Length+Breadth));
        System.out.println("Perimeter of Square is : " +  4*Length);
    }

    void Area()
    {
        System.out.println("\nArea of Rectangle is : " + Length*Breadth);
        System.out.println("Area of Square is : " + Length*Length);
    }
}

class Square extends Rectangle
{
    public Square(float S)
    {
        super(S,S);
    }
}

class prac19 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int no_of_object;
        float L;

        System.out.println(" ");

        System.out.print("Enter the number of Object's that you want to create : ");
        no_of_object = sc.nextInt();

        Square[] S = new Square[no_of_object];

        for(int i=0;i<no_of_object;i++)
        {
            System.out.print("\nEnter the Value of Length : ");
            L = sc.nextFloat();

            S[i] = new Square(L);

            S[i].Perimeter();
            S[i].Area();
        }

        sc.close();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS083_MARK");

    }  
}