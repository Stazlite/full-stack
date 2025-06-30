import java.util.*;
class Man {
    public void man(String name, int age) {
        System.out.println(name + " " + age);
    }
    class Dog{
        public void dog(String name,String color){
            System.out.println(name+"dog"+color);
        }
    }
}

public class whymetho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("enter the age");
        int age = sc.nextInt();
        Man obj = new Man();
        obj.man(sc.nextLine(), sc.nextInt());

        System.out.println("enter the dog name");
        String dogName = sc.nextLine();
        System.out.println("enter the color");
        String dogColor = sc.nextLine();
       Man.Dog obj1 = obj.new Dog();
        obj1.dog(sc.nextLine(),sc.nextLine());
    }
}
