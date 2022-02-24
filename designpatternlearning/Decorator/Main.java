
package designpatternlearning.Decorator;


public class Main {
    public static void main(String[] args){
        
        Circle c1 = new Circle(2);
        c1.showShape();
        
        DecoratorRedBorder c2 = new DecoratorRedBorder(c1);
        c2.showShape();
        
        /* If we have several decorator class
        we can do this for c1:
        Decorator2 c2 = new decorator2(c2);
        and so on......
        **/
        
    }
}
