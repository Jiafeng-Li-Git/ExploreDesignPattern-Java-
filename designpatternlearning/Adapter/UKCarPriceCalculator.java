
package designpatternlearning.adapter;


/*  This car class does not implement the PriceCalculator interface.
So when we put it in the showPrice method, we need an Adapter class.
**/
public class UKCarPriceCalculator {
    
    private int age;
    private int mileage;
    public static int avgPrice = 10000;
    
    public UKCarPriceCalculator(int age, int mileage){
        this.age = age;
        this.mileage = mileage;
    }
    
    public String getPrice(){
        int price = Math.max(avgPrice -age*10-mileage*10, 0);
        return price + "pound";
    }
}
