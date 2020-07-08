
package insvariable;


public class MyClass {
    int a=10;
    int b=20;
    int c;
      public void add()
      {
          int k=a;
          int d=this.a;
          int e=this.b;
          this.c=d+e;
          System.out.println(this.c);
           System.out.println("k="+k);
      }
    
}
