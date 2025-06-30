class mine_employee //class name
{//class body
    String emp_name;//variable name
    String emp_dept;//variable name
    double emp_salary;//variable name
    mine_employee(String name, String dept, double salary)//constructor
    {//constructor body
        emp_name=name;//assigning value to variable
        emp_dept=dept;//assigning value to variable
        emp_salary=salary;//assigning value to variable
    }//end of constructor
    public void display()//method name
    {//method body
        System.out.println("employee name :"+emp_name);//printing value of a variable
        System.out.println("employee dept :"+emp_dept);//printing value of a variable
        System.out.println("employee salary :"+emp_salary);//printing value of a variable
    }//end of method
}//end of class
public class mineemployee{//class name
    public static void main(String[] args) {//method name
        mine_employee obj=new mine_employee("vijay winston","unemployed",100000);//creating object
        obj.display();//calling method
    }//end of main
}//end of class

