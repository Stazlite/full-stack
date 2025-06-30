class yur implements Runnable/* (interface) */{
    String name;
    String[] msge;

    yur(String name, String[] msge) {
        this.name = name;
        this.msge = msge;
    }
    public void run() {
        for (String msg : msge) {
            System.out.println(name + "" + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
    public class multiread{
        public static void main(String[] args)
        {
            String[]user1={"hello","how r u","iam me bye"};
            String[]user2={"helo","who","ok bye"};
            Runnable onj=new yur("me :",user1);
            Runnable onj1=new yur("you :",user2);
            Thread obj=new Thread(onj);
            Thread obj2=new Thread(onj1);
            obj.start();
            try{
              Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            obj2.start();
        }
}







