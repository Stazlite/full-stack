class aa{
    static class cc{
        void fff(){
            System.out.println("static nested class");
        }
    }
}
public class static_nested_class {
    public static void main(String[] args){
        aa.cc obj=new aa.cc();
        obj.fff();
    }
}
