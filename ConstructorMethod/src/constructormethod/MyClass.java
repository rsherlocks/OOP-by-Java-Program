
package constructormethod;


public class MyClass {
    MyClass()
    {
        System.out.println("This is defult constructor method");
        
    }
    MyClass(int a)
    {
        int b=a;
//        System.out.println(b);
    }
     MyClass(double a)
    {
        double b=a;
        System.out.println(b);
    }
     public void con()
     {
         System.out.println("This is normal method");
     }
    
}
