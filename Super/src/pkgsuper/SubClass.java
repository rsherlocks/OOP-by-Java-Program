
package pkgsuper;


public class SubClass extends SuperClass {
    String s="from subclass";
    
    SubClass()
    {
        super();
         System.out.println(s);
        System.out.println(super.s);
    }
    @Override
   public void print()
    {
        super.print();
        System.out.println(s);
    }
    
}
