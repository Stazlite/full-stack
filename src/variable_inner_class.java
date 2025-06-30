class iio{
    private int a=22;
    class inner
    {
        public int getValue()
        {
            return a;
        }
    }
}
public class variable_inner_class {
    public static void main(String[] args) {
        iio obj=new iio();
        iio.inner obj1=obj.new inner();//inner class object creation
        System.out.println(obj1.getValue());//accessing the variable of outer class
    }
}
