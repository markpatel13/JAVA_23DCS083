class parent{
   
    void display(){
        System.out.println("This is a parent class");
    }
}
class child1 extends parent{
    void display1(){
        System.out.println("This is a child class");
    }
}
public class prac17 {
    public static void main(String[] args) {
        child1 obj = new child1();
       
        obj.display();
        obj.display1();
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");

    }
}
