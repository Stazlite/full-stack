class whh {
    void show(){
        System.out.println("a");
    }
    class b extends a{
        void demo (){
            System.out.println("b");
        }
        void show(){
            System.out.println("b show");
        }
    }
}
        class cat extends a{
    void demo (){
        System.out.println("child class");
        }
        void show1(){
            System.out.println("c show");
        }
        }
public class inhertance {
    public static void main(String[] args) {
        cat obj=new cat();
        obj.demo();
        obj.show1();

    }

}
