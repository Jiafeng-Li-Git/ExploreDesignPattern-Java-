

package designpatternlearning.Adapter;

public class Adapter implements PriceCalculator{
    
    UKCarPriceCalculator ukCarPriceCalculator;
    
    public Adapter(UKCarPriceCalculator ukCarPriceCalculator){
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }
    
    @Override
    public String calculatorPrice(){
        return this.ukCarPriceCalculator.getPrice();
    }
}
