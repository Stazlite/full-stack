abstract class circle {
    abstract void bike(String brand, String color);
}
    abstract class circle1 {
        abstract void person(String brand, String color);
    }
    public class exampp003  {
    public static void main(String[] args) {
        circle obj = new circle() {
            public void bike(String brand, String color) {
                System.out.println(brand + " " + color);
            }
        };
            circle1 obj1 = new circle1() {
                public void person(String brand, String color) {
                    System.out.println(brand + " " + color);
                }
            };
        obj.bike("bmw","red");
        obj1.person("enene","blue");
        }
    }
