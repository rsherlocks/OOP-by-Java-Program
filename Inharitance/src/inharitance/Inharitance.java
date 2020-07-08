
package inharitance;


public class Inharitance {

   
    public static void main(String[] args) {
        
        ChildClass sonobj=new ChildClass();
        sonobj.add();
        System.out.println(sonobj.a);
        System.out.println(FatherClass.d);
      
        System.out.println(ChildClass.e);
    }
    
}
