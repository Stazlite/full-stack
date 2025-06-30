class person1{
   private String name="mmm";
    private int age=20;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class encapsulation  {
    public static void main(String[] args){
        person1 obj=new person1();

        System.out.println(obj.getName()+"  "+obj.getAge());
    }
}
