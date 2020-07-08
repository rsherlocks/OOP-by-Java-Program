
package constructormethod;


public class ConstructorMethod {

    
    public static void main(String[] args) {
        
        MyClass obj1=new MyClass();
         MyClass obj2=new MyClass(10);
          MyClass obj3=new MyClass(20.20);
          obj1.con();
          MyClass a=obj2;
           System.out.println(a);
          obj3.con();
        
    }
    
}
