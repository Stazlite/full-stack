class outer{
    private class inner{
        void demo1(){
            System.out.println("inner class");
        }
    }
    void didd(){
            inner obj=new inner();
            obj.demo1();
    }
}
public class inner_class {
    public static void main(String[] args) {
        outer obj=new outer();
        obj.didd();
    }
}
