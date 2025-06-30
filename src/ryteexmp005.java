class yui{
    void dif(){
        class innerrr{
            void gta(String name,int age){
                System.out.println(name+" "+age);
            }
        }
        innerrr obj=new innerrr();
        obj.gta("msc",22);
    }
}
public class ryteexmp005 {
    public static void main(String[] args){
        yui objw = new yui();
        objw.dif();
    }
}
