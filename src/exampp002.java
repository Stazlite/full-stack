
abstract class cicl
{
     abstract void bike(String brand,String color);
    abstract void person(String brand,String color);
}
public class exampp002 {
    public static void main(String[] args) {
        cicl obj = new cicl() {
            public void bike(String brand, String color) {
                System.out.println(brand+" "+color);
            }
            public void person(String brand, String color) {
                System.out.println(brand + " " + color);
            }
        };
        obj.bike ("bmw","red");
        obj.person("enene","blue");
    }
}
