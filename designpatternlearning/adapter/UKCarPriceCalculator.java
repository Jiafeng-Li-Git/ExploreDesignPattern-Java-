
package designpatternlearning.adapter;


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
