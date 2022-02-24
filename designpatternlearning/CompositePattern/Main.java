

package designpatternlearning.CompositePattern;

public class Main {
    public static void main(String[] args){
        
        Manager manager = new Manager("Ted");
        
        ManagerTeam mt = new ManagerTeam();
        mt.addPayee(manager);
        
        payPayee(mt, 100);
        payPayee(manager, 200);
        
        
    }
    
    public static void payPayee(Payee payee, int amount){
        payee.payExpenses(amount);
    }


}
