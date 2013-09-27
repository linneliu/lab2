

public class SoldState implements State {
 
    GumballMachine gumballMachine;
    boolean isGumballInSlot=true;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertQuarter(int quarter) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void insertNickel(int nickel) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void insertDime(int dime) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
 
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() >0) {
            //isGumballInSlot= true;
            //System.out.println("55555555 has ball");
            gumballMachine.setState(gumballMachine. getInsufficientCoinState());
            
            
        } else {
            System.out.println("Oops, out of gumballs!");
            System.out.println("");
            //isGumballInSlot = false;
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
    
    
    public boolean isGumballInSlot(){
       //gumballMachine.releaseBall();
       if (gumballMachine.getCount() > 0) 
            return true;
       else
            return false;
       
      //return true;
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


