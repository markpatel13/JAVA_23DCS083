
    import java.util.*;
    class Complex{
    int realpart;
    int imaginarypart;
    
    
    Complex(){
        realpart=2;
        imaginarypart=3;
    }
    void setdata(int x,int y){
        realpart=x;
        imaginarypart=y;
    }
    
    Complex add(Complex o1,Complex o2){
        Complex demo = new Complex();
        demo.realpart=o1.realpart+o2.realpart;
        demo.imaginarypart=o1.imaginarypart+o2.imaginarypart;
        return demo;
        
    }
    Complex sub(Complex o1,Complex o2){
        Complex demo = new Complex();
        demo.realpart=o1.realpart-o2.realpart;
        demo.imaginarypart=o1.imaginarypart-o2.imaginarypart;
        return demo;
        
    }
    Complex multi(Complex o1, Complex o2){
        Complex demo = new Complex();
        demo.realpart = (o1.realpart * o2.realpart) - (o1.imaginarypart * o2.imaginarypart);
        demo.imaginarypart = (o1.realpart * o2.imaginarypart) + (o2.realpart * o1.imaginarypart);
        return demo;
    }
    
    void display(){
        System.out.println("The complex number is "+realpart+" + "+imaginarypart+"i");
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");
    }
    
    
    };
    public class prac16 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Complex obj1 = new Complex();
            int r,i;
            System.out.println("Enter the real part ");
            r=sc.nextInt();
            System.out.println("Enter the imaginary part ");
            i=sc.nextInt();
            Complex obj2 = new Complex();
            obj2.setdata(r, i);
            System.out.println("Enter the opertaion you want to perform +,-,*");
            char choice = sc.next().charAt(0);//char at string index 0
    
            switch (choice) {
                case '+':
                    Complex temp = new Complex();
                    Complex obj3=temp.add(obj1, obj2);
                    obj3.display();
                    
                    break;
            
                case '-':
                    Complex temp1 = new Complex();
                    Complex obj4=temp1.sub(obj1, obj2);
                    obj4.display();
                    
                    break;
            
                case '*':
                    Complex temp2 = new Complex();
                    Complex obj5=temp2.multi(obj1, obj2);
                    obj5.display();
                    
                    break;
            
                default:
                    break;
            }
    
        }
    } 

