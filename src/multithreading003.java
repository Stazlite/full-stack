class user_1 extends Thread {
    String user_1;
    String[] msg;

    public user_1(String user, String[] msg) {
        this.user_1 = user;
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < msg.length; i++) {
            System.out.println(user_1 + ":" + msg[i]);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class user_2 extends Thread {
    String user_2;
    String[] msg;

    public user_2(String user, String[] msg) {
        this.user_2 = user;
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < msg.length; i++) {
            System.out.println(user_2 + ":" + msg[i]);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class multithreading003 {
    public static void main(String[] args) {
        String[] user1 = {"hii", "i am friend", "ok"};
                String[]user2 = {"who r u", "hoo","ok byee"};
        Thread t1 = new user_1("user1", user1);
        Thread t2 = new user_2("user2", user2);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
    }


