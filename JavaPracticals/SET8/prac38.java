import java.util.*;

class StackList{

    private ArrayList<Integer> STL;

    public StackList(){
        STL = new ArrayList<>();
    }

    public boolean isEmpty() {
        return STL.isEmpty();
    }

    public void push(Integer value) {
       
        STL.add(value);
        //updateFile(); 
    }

    public void pop(){
        if(STL.isEmpty()){
            System.out.println("Stack is empty");
            //return null;
        }
        else{
             STL.remove(STL.size()-1);
        }
    }

    public Integer peek(){
        if(STL.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{

            return STL.get(STL.size()-1);
        }
    }

    public void display(){
        System.out.println(STL);
    }

    public void clr(){
        STL.clear();
    }

    public void size1(){
        System.out.println(STL.size());
    }

   public void updatafile(){
    
   }


}
public class prac38 {
    public static void main(String[] args) {

        StackList stack = new StackList();
        stack.push(10);
        stack.push(20);
        stack.push(70);
        stack.push(40);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.peek()); // Outputs: 30
        stack.pop();
        stack.display();



        // System.out.println("Popped element: " + stack.pop()); // Outputs: 30
        System.out.println("Top element after pop: " + stack.peek()); // Outputs: 20
        System.out.println("23DCS083_MARK");
        //stack.clr();
        // stack.size1();
        // stack.display();
        // stack.clr();
        // stack.display();
        
    }
}
