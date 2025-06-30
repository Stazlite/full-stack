interface going
{
    void add(int a,int b);
    void sub(int a,int b);
}
public class examp004 {
    public static void main(String[] args) {
        going obj=new going() {

            public void add(int a, int b) {
                System.out.println(a+b);
            }

            public void sub(int a, int b) {
                System.out.println(a-b);
            }
        };
        obj.add(19,68);
        obj.sub(34,44);
    }
}