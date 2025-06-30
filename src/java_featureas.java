interface Aaaa{
    default void demo() {
        System.out.println("demo");//    after java version 8, method  defination inside the interface
    }
}
class demo1 implements Aaaa
{

}

public class java_featureas {
    public static void main(String[] args){
        Aaaa obj=new demo1();
        obj.demo();

    }
}
