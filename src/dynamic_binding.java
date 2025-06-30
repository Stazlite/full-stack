class A{
    public void shao() {
        System.out.println("heee");

    }
}
class B extends A{
    public void shao(){
        System.out.println("hhhsj");
    }
}
public class dynamic_binding {
    public static void main(String[] args){
        A oo=new B();
        oo.shao();
    }
}
