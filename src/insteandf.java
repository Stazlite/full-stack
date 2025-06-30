interface i1{
    void vehical(String brand,String model,String price);
}
interface i2 extends i1{
    void car(String brand,String model,String price);
}
interface i3 extends i2{//
void bike(String brand,String model,String price);
}
class demo implements i3{
    public void vehical(String brand, String model, String price) {
        System.out.println(brand + " " + model + " " + price);
    }
    public void car(String brand, String model, String price) {
        System.out.println(brand + " " + model + " " + price);
    }
    public void bike(String brand, String model, String price) {
        System.out.println(brand + " " + model + " " + price);
    }
}
public class insteandf {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.vehical("bmw","x5","10000 $");
        obj.car("porche","gt3","15000 $");
        obj.bike("honda","ninja","15000 $");
    }
}
