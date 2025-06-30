class s implements Runnable
{
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("helo");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class j implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 2; i++){
        System.out.println("hello");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
}
public class multithreading002 {
    public static void main(String[] args) {
        Runnable obj1 = new s();
        Runnable obj2 = new j();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}