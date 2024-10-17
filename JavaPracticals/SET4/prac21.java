class Degree{
    public void print(){
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    @Override
    public void print(){
        System.out.println("I am  an Undergraduate");
    }
}
class Postgraduate extends Degree{
    @Override
    public void print(){
        System.out.println("I am  an Postgraduate");
    }
}
public class prac21 {
    public static void main(String[] args) {
        Degree d1 = new Degree();
        d1.print();
        Undergraduate d2 = new Undergraduate();
        d2.print();
        Postgraduate d3 = new Postgraduate();
        d3.print();
        System.out.println();
        System.out.println("23DCS083_MARK");
    }
}
