interface Dog {
    void dogs(String name, String color, String breed);
}
interface Catt {
    void cats(String name, String color);
}
class Cad implements Dog, Catt {
    public void dogs(String name, String color, String breed) {
        System.out.println(name + " " + color + " " + breed);
    }
    public void cats(String name, String color) {
        System.out.println(name + " " + color);
    }
}
public class ggabidcbhb {
        public static void main(String[] args)
        {
        Cad obj = new Cad();
        obj.dogs("Mike", "Blue", "BNNB");
        obj.cats("Mijg", "Blue");
    }}



