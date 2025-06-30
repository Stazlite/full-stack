interface education{
    public void school(String name,int duration,String branch);
public void diploma(String name,int duration,String branch);
    public void btech(String name,int duration,String branch);
}
class peak implements education
{
    public void school(String name,int duration,String branch){
        System.out.println(name+" "+duration+" "+branch);
    }
    public void diploma(String name,int duration,String branch){
        System.out.println(name+" "+duration+" "+branch);
    }
    public void btech(String name,int duration,String branch){
        System.out.println(name+" "+duration+" "+branch);
    }
}
public class inhertanceex001 {
    public static void main(String[] args) {
        peak cof=new peak();
        cof.school("vrb",10,"school");
        cof.diploma("mic",3,"eee");
        cof.btech("kvsrit",10,"cse");
    }
}
