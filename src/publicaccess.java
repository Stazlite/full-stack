class publcaccess {//public access modifier
    public void show(){
        System.out.println("public access");
    }
}
public class publicaccess {//main method
    public static void main(String[] args) {
        publcaccess obj=new publcaccess();
        obj.show();
    }
}
