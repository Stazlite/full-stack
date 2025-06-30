import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public interface collecteror
{
}
class collectoror1 implements collecteror{
    public  static void main (String[] args){
        ArrayList<String> nn= new ArrayList<>(List.of("S vijay winston","cse","22fh5a0509"));
        LinkedList<String> ll=new LinkedList<>(List.of("bike","4 stroke","model"));
        Vector<Integer> vv=new Vector<>(List.of(1,2,3,4,5));
        nn.add("place");
        ll.add("price");
        vv.add(8);
        System.out.println(nn);
        nn.removeLast();
        System.out.println(nn);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        System.out.println(vv);
        vv.removeLast();
        System.out.println(vv);
        System.out.println(ll.contains("place"));
        nn.clear();
        ll.clear();
        vv.clear();
        System.out.println(vv);
        System.out.println(ll);
        System.out.println(nn);
    }
}
