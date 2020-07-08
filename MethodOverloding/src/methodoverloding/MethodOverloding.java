
package methodoverloding;


public class MethodOverloding {

   
    public static void main(String[] args) {
        
        MyClass obj=new MyClass();
        obj.load(20.20, 20.30);
        obj.load(20,30,40);
        MyClass.load(10, 20.20);
        MyClass.load(20, 30);
      
    }
    
}
