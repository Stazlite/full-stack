class parent_mobile {
    void par(String brand, String ram, String processor) {
        System.out.println("parent mobile " + brand + " " + ram + " " + processor);
    }
}
    class mine extends parent_mobile {
        void my (String brand, String ram, String processor) {
            System.out.println("mine mobile " + brand + " " + ram + " " + processor);
        }
    }
public class phone_eamp {
    public static void main(String[] args) {
        mine obj=new mine();
        obj.par("samsung","4gb","Snapdragon");
        obj.my("realme","8gb","mediatech 8100");
    }
}

