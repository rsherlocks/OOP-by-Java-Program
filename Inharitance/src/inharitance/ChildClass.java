
package inharitance;


public class ChildClass extends FatherClass{
    
    static int e=45;
    
    @Override
    public  void add()
    {
        this.c=this.a-this.c;
        System.out.println(this.c);
    }
    
    
}
