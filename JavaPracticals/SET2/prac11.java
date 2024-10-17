public class prac11 {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("CHARUSAT UNIVERSITY");
        System.out.println("length of String is :" +st.length());
        st.setCharAt(1, 'M');
        System.out.println("replacing my name character :" +st);
        String s = new String(st);
       
        System.out.println("to lowercase : " +s.toLowerCase());
        System.out.println();
        System.out.println("23DCS083_MARK_PATEL");
    }
}
