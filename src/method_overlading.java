class abcd
{
    public void add(int a,int b){
        System.out.println(a=b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class method_overlading {
    public static void main(String[] args) {
        abcd obj=new abcd();
        obj.add(10,20);
        obj.add(10,20,30);
    }
}
