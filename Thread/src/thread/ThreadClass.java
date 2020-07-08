
package thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadClass {

   
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
      
    }
    
}
class A extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Rakib");
        }
    }   
}
class B extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Sakib");
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
