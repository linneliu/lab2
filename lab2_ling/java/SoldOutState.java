

public class SoldOutState implements State {
    GumballMachine gumballMachine;
    
    
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
       
    }
 
    public void insertQuarter(int quarter) {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }
       
    public void insertDime(int dime){
        System.out.println("You can't insert a dime, the machine is sold out");
    }
     
    public void insertNickel(int nickel){
        System.out.println("You can't insert a nickel the machine is sold out");
    }
    
   
    

 
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted any coins yet");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public boolean isGumballInSlot(){
         return false;
    }
    
 
    public String toString() {
        return "sold out";
    }
}
