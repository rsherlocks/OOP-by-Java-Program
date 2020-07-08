
package methodoverloding;


public class MyClass {
    public void load(double a,double b)
    {
        double c=a+b;
        System.out.println(c);
        
    }
    public void load(int a,int b,int c)
    {
        
        int d=a+b+c;
        System.out.println(d);
    }
    
    public static void load(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    public static void load(int a,double b)
    {
        double c=a+b;
        System.out.println(c);
        
    }
    
    
}
