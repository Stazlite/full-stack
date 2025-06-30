class medth{
    public void medth(String name,String dept){
        System.out.println(name+" "+dept);

    }
    public void dance(String name,String dept,String address){
        System.out.println(name+" "+dept+" "+address);
    }
}
public class methodoverload_examp {
    public static void main(String[] args) {
        medth obj=new medth();
        obj.medth("vijay","IT");
        obj.dance("vijay","IT","mars");
    }
}
