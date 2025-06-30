class people{
    private String name="vijjj";
    private int age=22;
    public void setName(String name1){
        name=name1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class examoooo {
    public static void main(String[] args){
        people obj=new people();

        System.out.println(obj.getName()+" "+obj.getAge());
    }
}
