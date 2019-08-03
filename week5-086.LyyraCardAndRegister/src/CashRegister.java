
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        double ecoLunch = 2.50;
        if (cashGiven >= ecoLunch){
            cashInRegister += ecoLunch;
            economicalSold++;
            return cashGiven - ecoLunch;
        } else {
            return cashGiven;
        }

        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gourmetLunch = 4.00;
        if (cashGiven >= gourmetLunch){
            cashInRegister += gourmetLunch;
            gourmetSold++;
            return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        double ecoLunch = 2.50;
        if (card.balance()>= ecoLunch){
            card.pay(ecoLunch);     
            economicalSold++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        double gourmetLunch = 4.00;
        if (card.balance()>= gourmetLunch){
            card.pay(gourmetLunch);
            gourmetSold++;
            return true;
        }else{
            return false;
        }
        
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0){
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }



    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
