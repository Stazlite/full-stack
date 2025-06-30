abstract class cic
{
    public abstract void show();
}
public class anonomous_class {
    public static void main(String[] args) {
        cic obj = new cic() {
            public void show() {
                System.out.println("anonomous class");
            }
        };
        obj.show();
    }
}
