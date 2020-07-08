
package interfac;

interface first{
    void FirstMethod();
}
interface second{
    void SecondMethod();
}
interface third{
    void ThirdMethod();
}
public class MyClass implements first,second,third {

    @Override
    public void FirstMethod() {
       System.out.println("Frist Method");
    }
    @Override
    public void SecondMethod() {
       System.out.println("Second Method");
    }
     @Override
    public void ThirdMethod() {
       System.out.println("Third Method");
    }
   
    
}
