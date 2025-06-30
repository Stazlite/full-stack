class abc{
    String name;
    String role;
    double salary;
    abc(String n,String r,double s){
        name=n;
        role=r;
        salary=s;
    }
    public void display(){
        System.out.println(name+" "+role+" "+salary);
    }
}
public class Example {
    public static void main(String[] args) {
        abc obj=new abc("Santhosh","Backend_Developer",700000);
        obj.display();

    }
}
