
package setget;


public class MyClass {
    private final String s="getter rakib";
    private String m;
    public String name;
   
    
    public String get()
    {
        return name;
    }
    public void set(String set)
    {
        this.m=set;
        
        System.out.println(m);
         //System.out.println(name);
    }

    
    
}
