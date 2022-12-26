

package designpatternlearning.Adapter;

public class Main {
    public static void main(String[] args){
        
        CarPriceCalculator car1 = new CarPriceCalculator(10, 80);
        showPrice(car1);
        
        TruckPriceCalculator truck1 = new TruckPriceCalculator(4, 100);
        showPrice(truck1);
        
        UKCarPriceCalculator ukcar1 = new UKCarPriceCalculator(5, 100);
        showPrice(new Adapter(ukcar1));
        
    }
    
    public static void showPrice(PriceCalculator calculator){
        System.out.println("The price of this vehicle is: " + calculator.calculatorPrice());
    }
}
