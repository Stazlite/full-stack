class student55{
private String name="vijjj";
private int age=22;
private String address="bangalore";
private String branch="cse";
public void setName(String name1){
    name=name1;
}
public void setAge(int age1){
    age=age1;
}
    public void setAddress(String address1){
        address=address1;
    }
    public void setBranch(String branch1){
        branch=branch1;
    }
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public String getAddress(){
    return address;
}
public String getBranch(){
    return branch;
}}
public class examppp003 {
    public static void main(String[] args){
        student55 obj=new student55();
        System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getAddress()+" "+obj.getBranch());
    }}
