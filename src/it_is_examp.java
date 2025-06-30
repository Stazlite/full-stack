interface it_details{
    static void mine(String name,int age){
        System.out.println("name:"+name+"age:"+age);
    }
    default void mias(String name,int age){
        System.out.println("name:"+name+"age:"+age);
    }
}
class it_is implements it_details {
    public void mias(String name, int age) {
        System.out.println("name: "+name+" "+"age :"+age);
    }
}
public class it_is_examp {
    public static void main(String[] args){
        it_details.mine("vijay",22);
        it_is bios=new it_is();
        bios.mias("winston",4);
    }
}
