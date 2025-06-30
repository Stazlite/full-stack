public class exception003 {
    public static void main(String[] args) {
        int a=7;
        int b=3;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
}
}

