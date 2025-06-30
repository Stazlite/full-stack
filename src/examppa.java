class outeeer {
    class inner {
        private void getvalue() {
            System.out.println("hhhh");

        }
        void demo1(){
            inner obj=new inner();
            obj.getvalue();
        }
    }
}
public class examppa {
    public static void main(String[] args){
        outeeer obj=new outeeer();
        obj.new inner().demo1();
    }
}
