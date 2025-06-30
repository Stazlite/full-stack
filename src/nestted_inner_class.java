class Denno{
    void show(){
        class inner{
            void ffi()
            {
                System.out.println("inner class");
            }
        }
        inner obj1=new inner();
        obj1.ffi();
    }
}
public class nestted_inner_class {
public static void main(String[] args){
    Deno obj=new Deno();
    obj.show();
}
}
