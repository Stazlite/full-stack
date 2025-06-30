class value1{
    void dann(float a,float b){
        System.out.println(a+b);
    }
    void ehy(float a,float b,float c){
        System.out.println(a+b+c);
    }
}
public class examp {
    public static <args> void main (String[] args){
        value1 obj=new value1();
        obj.dann(1.0f,4.87f);
        obj.ehy(77.0f,99.86f,5.0f);

    }
}
