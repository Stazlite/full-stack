class car {//class name must be same as file name
    String name;//
    String color;//
    int price;//

    car(String n, String c, int p) //
    {//
        name = n;
        color = c;
        price = p;
    }

    public void show() {
        System.out.println(name + " " + color + " " + price);
    }
}
public class conn {
        public static void main(String[] args) {
            car obj = new car("bmw", "blue", 10000);
            obj.show();
        }

    }





