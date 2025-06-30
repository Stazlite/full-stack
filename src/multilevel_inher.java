class a{
    void show(){
        System.out.println("a");
    }
}
class b extends a{
    void show(){
        System.out.println("b");
    }
    void why(){
        System.out.println("b show");
    }
}
class c extends b{
    void show(){
        System.out.println("c show");
    }
    void why(){
        System.out.println("c why ");
    }
    void how(){
        System.out.println("c how");
    }
}
public class multilevel_inher {
    public static void main(String[] args) {
        c obj=new c();
        obj.show();
        obj.why();
        obj.how();
    }}
