interface jig{
    static void demi() {
        System.out.println("demo 1");
    }
}
interface jag{
    static void demi() {
        System.out.println("demo 2");
    }
}
class ui{
    public void demi() {
        System.out.println("demo 3");
    }
}
public class java_8_features001 extends ui implements jig  {
    public static void main(String[] args){
      jag.demi();
    }

}
