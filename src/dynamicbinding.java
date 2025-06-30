class Ah{
    public void shao() {//dynamic binding overriding
        System.out.println("heee");

    }
}
class Bk extends Ah{
    public void shao(){
        System.out.println("hello");
    }
}
public class dynamicbinding {
    public static void main(String[] args){
        Ah oo=new Ah();
        oo.shao();
    }
}
