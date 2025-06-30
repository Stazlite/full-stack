class nomm{
    private String name="ijay";
    private int age=22;
 class inner88{
     void ojxs(){
         System.out.println(name+" "+age);
     }
 }
}
public class non_static {
    public static void main(String[] args){
        nomm obj=new nomm();
        nomm.inner88 obj2=obj.new inner88();
        obj2.ojxs();
    }
}
