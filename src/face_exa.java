interface AA{
    void shao();
}
interface Bb{
    void sun();
}
class Cc implements AA,Bb{
    public void shao() {
        System.out.println("hello 1");
    }
    public void sun() {
        System.out.println("hello 2");
    }
}
public class face_exa {
    public static void main(String[] args) {
        Cc obl=new Cc();
        obl.shao();
        obl.sun();
    }
}
