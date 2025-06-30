 class yyj {
     private String name = "yuu";

     private void show() {//private access
         System.out.println(name);
     }

     void show1() {//default access
         show();
     }
 }
    public class privateaccess {//pro
        public static void main(String[] args) {
            yyj obj = new yyj();
            obj.show1();
        }
    }
