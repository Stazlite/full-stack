import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
public class consumer001
{
public static void main(String[] args)
{
    List<Integer> list=Arrays.asList(1,2,3,4,5);
    Consumer<Integer> obj=i->System.out.println(i);//(lamda function)
    list.forEach(obj);
}
}
