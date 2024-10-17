import java.io.*;
public class prac26 {

    public static void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            int a = 7 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        try {
            readFile("abc3.txt");
        }catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }

        try {
            Class.forName("prac216");
           // System.out.println("Class found");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exception caught: " + e);
        }
        finally{
            System.out.println("23DCS083_MARK");
        }
    }
} 
    

