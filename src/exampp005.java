interface going3
{
    void add(int a,int b);
    void sub(int a,int b);
}
interface going1{
    void mul(int a,int b);
}
public class exampp005  {
    public static void main(String[] args) {
        going3 obj=new going3() {

            public void add(int a, int b) {
                System.out.println(a+b);
            }
            public void sub(int a, int b) {
                System.out.println(a-b);
            }
        };
        going1 obj1=new going1() {
        public void mul(int a, int b) {
            System.out.println(a*b);
        }
    };
        obj.add(19,68);
        obj.sub(34,44);
        obj1.mul(13,33);
    }}


