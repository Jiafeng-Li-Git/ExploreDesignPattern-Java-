
package designpatternlearning.Adapter;


public class TruckPriceCalculator implements PriceCalculator{
    private int age;
    private int mileage;
    public static int avgPrice = 10000;
    
    public TruckPriceCalculator(int age, int mileage){
        this.age = age;
        this.mileage = mileage;
    }
    
    @Override
    public String calculatorPrice(){
        int price = Math.max(avgPrice-age*100-mileage/100, 0);
        return price+" USD";
    }
}
