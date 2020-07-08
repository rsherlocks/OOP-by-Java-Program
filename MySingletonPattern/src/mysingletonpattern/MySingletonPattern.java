
package mysingletonpattern;


public class MySingletonPattern {

   
    public static void main(String[] args) {
        My object=My.getInstance();
      
    }
    
}
class My{
    static My obj=new My();
    private My()
    {
        
    }
    public static My getInstance()
    {
        return obj;
    }
    
}
