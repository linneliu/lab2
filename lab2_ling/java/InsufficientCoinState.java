
/**
 * Write a description of class InsufficientCoinState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsufficientCoinState implements State
{
    // instance variables - replace the example below with your own
    GumballMachine gumballMachine;
    int coin;

    /**
     * Constructor for objects of class InsufficientCoinState
     */
    public InsufficientCoinState(GumballMachine gumballMachine)
    {
       this.gumballMachine = gumballMachine;
       
    }
    
    public void setCoin( int coin){
        this.coin = coin;
    }
    
    public void insertQuarter(int quarter){
        System.out.println("You inserted a quarter");
        coin = coin+25;
        //System.out.println("coin" + coin);
        if(coin>=50){
            System.out.println("enough");
            coin = 0;
            gumballMachine.setState(gumballMachine.getHasQuarterState());
           
        }
    }
    
    
    public void insertDime(int dime){
        System.out.println("You inserted a dime");
        coin = coin+10;
        //System.out.println("coin" + coin);
        if(coin>=50){
             coin =0;
            System.out.print("enough");
            gumballMachine.setState(gumballMachine.getHasQuarterState());
           
        }
    }
    
     public void insertNickel(int nickel){
        System.out.println("You inserted a Nickel");
        coin = coin+5;
        //System.out.println("coin" + coin);
        if(coin>=50){
           coin = 0;
            System.out.println("enough");
            gumballMachine.setState(gumballMachine.getHasQuarterState());
            
        }
    }
    
    public void ejectQuarter(){
        System.out.println("coins returned");
        gumballMachine.setState(gumballMachine. getInsufficientCoinState());
    }
    
    public void turnCrank(){
        System.out.println("You turned, but there's enough coin");
    }
    public void dispense(){
        System.out.println("You need to pay enough");
    }
    
    public boolean isGumballInSlot(){
       return false;
    }
    
    
    public String toString() {
        return "insufficient coins, waiting for coin";
    }
}
