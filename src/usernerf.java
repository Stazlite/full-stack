import java.util.*;
class student {
    private int id;
    public String name;

    void mainn(int id, String name) {
        System.out.println(id + " " + name);
    }
}
public class usernerf{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the id");
        int id = sc.nextInt();
        student obj=new student();
        obj.mainn(id,name);
    }
}



