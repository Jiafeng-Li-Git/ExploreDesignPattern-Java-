
package designpatternlearning.Decorator;


public class Circle implements Shape{
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public void showShape(){
        System.out.println("This Circle's area is " + Math.PI*radius*radius);
    }
    
}
