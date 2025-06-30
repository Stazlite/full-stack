class parent
{
    public void show(){
        System.out.println("parent");//parent method
    }
}
class child extends parent {//child inherit parent class
    public void show(){
        System.out.println("child");//child override parent method
    }
    public void why(){//child method
        System.out.println("extra feature");//extra feature
    }
}


public class singleinhertance
{//single inheritance
    public static void main(String[] args) {
        child obj=new child();
        obj.show();
        obj.why();
    }
}
