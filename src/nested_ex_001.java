class Deno{
    void show(){
        class inner{
            void person(String name,int age)
            {
                System.out.println("person details:"+""+name+" "+age);
            }
            void car(String name,int price)
            {
                System.out.println("car details:"+" "+name+" "+price);
            }
        }
        inner obj1=new inner();
        obj1.person ("vijay",20);
        obj1.car("yuk",100000);
    }
}
public class nested_ex_001{
    public static void main(String[] args){
        Deno obj=new Deno();
        obj.show();
    }
}