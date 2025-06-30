import java.util.*;

public class  Exampleswitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fucking marks from 1 to 10");
        int marks = sc.nextInt();
        int grade=marks/10;
        switch(grade){
            case 10:
                System.out.println("a");
                break;
            case 9:
                System.out.println("b");
                break;

            case 8:
                System.out.println("c");
                break;
            case 7:
                System.out.println("f");
                break;
            case 6:
                System.out.println("pass");
                break;
            case 5:
                System.out.println("pass but waste");
                break;
            case 4:
                System.out.println("try again");
                break;

            case 3:
                System.out.println("u r a disgrace");
                break;
            case 2:
                System.out.println("dont dare to write again");
                break;
            case 1:
                System.out.println("go die");
                break;
            default:
                System.out.println("just die mf");
                break;

        }
    }}



