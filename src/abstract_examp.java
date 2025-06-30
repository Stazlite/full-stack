abstract class why{
    abstract void car(String brand,String color,int price);
     abstract void person(String name,int budget,String job);
     void collage(String name,String dept){
        System.out.println(name+" "+dept);
     }
}
class heel extends why{
    void car(String brand,String color,int price){
        System.out.println(brand+" "+color+" "+price);
    }
    void person(String name,int budget,String job){
        System.out.println(name+" "+budget+" "+job);
    }
}
public class abstract_examp {
    public static void main(String[] args){
        heel obj=new heel();
        obj.car("bmw","blue",100000);
        obj.person("vijay",100000,"IT");

        obj.collage("tata","IT");
    }
}
