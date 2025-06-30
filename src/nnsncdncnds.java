// inner class

class outeeur
{
    private class inner {
        void demo1(String emp_name, int emp_id) {
            System.out.println(emp_name + " " + emp_id);
        }
        void didd(String dept, String head) {
            System.out.println(dept + " " + head);
        }
    }
     void access()
    {
        inner obj1=new inner();
        obj1.demo1("bbb",66);
        obj1.didd("bbb","bbh");
    }
}
public class  nnsncdncnds{
    public static void main(String[] args) {
        outeeur obj=new outeeur();
        obj.access();
    }
}
