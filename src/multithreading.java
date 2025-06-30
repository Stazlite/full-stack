class As extends Thread{
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Red");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Bbb extends Thread {
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Yellow");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class ccc extends Thread {
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Green");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

    public class multithreading {
        public static void main(String[] args) {
            As obj = new As();
            Bbb obj2 = new Bbb();
            ccc obj3 = new ccc();
            obj.start();
            obj2.start();
            obj3.start();

        }
    }




