class Asb extends Thread {
    public void run() {
        for (int i = 0; i < 1; i++)
        {
            System.out.println("Red");
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Yellow");


                try {
                    Thread.sleep(1000);
                } catch (Exception e)
                {
                    System.out.println(e);
                }

            System.out.println("Green");

            try
              {
                Thread.sleep(1000);
              }
                 catch (Exception e)
                 {
                System.out.println(e);
                 }
            }
    }
}
public class multi_thread {
        public static void main(String[] args) throws InterruptedException {
            Asb obj = new Asb();
            obj.start();
        }
    }





