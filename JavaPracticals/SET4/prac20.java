class Shape{
     public void print1(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    public void print2(){
        System.out.println("This is rectagle shape");
    }
}
class Circle extends Shape{
    public void print3(){
    System.out.println("This is circular shape");
    }
}

class Square extends Rectangle{
    public void print4(){
        System.out.println("Square is rectangle");
    }
}
public class prac20 {
    public static void main(String[] args) {
        Square obj = new Square();
        obj.print1();
        obj.print2();
        obj.print4();
        System.out.println();
        System.out.println("23DCS083_MARK");
    }
}
