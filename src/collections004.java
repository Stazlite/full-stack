import java.util.ArrayList;
import java.util.List;
public interface collections004 {
}
class collections004_1 implements collections004{
    public static void main(String[] args){
        List<Integer>LL=new ArrayList<>();
        LL.add(84);
        LL.add(14);
        LL.add(33);
        LL.addFirst(88);
        System.out.println(LL);
        LL.addLast(77);
        System.out.println(LL);
    }
}