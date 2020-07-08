
package pkgabstract;


abstract class MyClass {
    
    abstract void demo();
    
    abstract void demo1();
    
    
}
class HelpTo extends MyClass{
    @Override
    public void demo()
    {
        System.out.println("Abstract Class");
    }
    @Override
    public void demo1()
    {
        System.out.println("Abstract Class2");
    }
}
