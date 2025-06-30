class outeer
{
    private class inner
    {
        void demo1(String name,int age)
        {
            System.out.println(name+" "+age);
        }
    }
    void didd()
    {
        inner obj1=new inner();
        obj1.demo1("bbb",66);
    }
}
public class  inner_examp{
    public static void main(String[] args) {
        outeer obj=new outeer();
        obj.didd();
    }
}