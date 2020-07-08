
package threadinterface;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadInterface {

  
    public static void main(String[] args) {
       A obj1=new A();
        B obj2=new B();
        //Thread x=new Thread(obj1);
          //x.start();
        //Thread y=new Thread(obj2);
        //y.start();
        Thread x=new Thread(new Runnable(){
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
            
        });
        x.start();
        
        Thread y=new Thread(new Runnable(){
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
            System.out.println("Sakib");
        }
            }
            
        });
        y.start();
        
        
       
    }
    
}
class A implements Runnable{
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
class B implements Runnable{
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
