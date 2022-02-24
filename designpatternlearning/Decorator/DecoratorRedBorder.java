

package designpatternlearning.Decorator;


/* When we want to add some responsibilities to the circle class, or any other class beneath Shape interface, decorator pattern can be used.
And this adding can be done dynamically when using decorator pattern.
To do this, we need to create a decorator class like this class of DecoratorRedBorder. 
We are also able to use several decorator class to decorate one 'shape' Class.
**/
public class DecoratorRedBorder implements Shape{
    
    private Shape shape;
    
    public DecoratorRedBorder(Shape shape){
        this.shape = shape;
    }
    
    @Override
    public void showShape(){
        this.shape.showShape();
        System.out.print("And it has red border.");
    }
    
}
