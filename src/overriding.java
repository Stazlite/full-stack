class mobile {
    public void call() {
        System.out.println("apple");
    }
}
        class black extends mobile {
        public void call() {
            System.out.println("jio phone");
        }
    }
    public class overriding {
        public static void main(String[] args) {
            black obj=new black();
            obj.call();
        }
    }
