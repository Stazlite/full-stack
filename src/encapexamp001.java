class person188{
    private String emp_name;
    private int emp_id;
    private int emp_salary;
    public void setEmp_name(String emp_name1){
        emp_name=emp_name1;
    }
    public void setEmp_id(int emp_id1){
        emp_id=emp_id1;
    }
    public void setEmp_salary(int emp_salary1){
        emp_salary=emp_salary1;
}
public String getEmp_name(){
    return emp_name;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public int getEmp_salary(){
        return emp_salary;
    }}
public class encapexamp001  {
    public static void main(String[] args){
        person188 obj=new person188();
        obj.setEmp_name("enooo nooo");
        obj.setEmp_id(55);
        obj.setEmp_salary(88888);
        System.out.println(obj.getEmp_name()+" "+obj.getEmp_id()+" "+obj.getEmp_salary());
    }
}