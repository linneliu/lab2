

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter(int quarter) {
		System.out.println("You can't insert another quarter");
	}
	
	public void insertDime(int dime) {
		System.out.println("You can't insert another dime");
	}
	
	public void insertNickel(int nickel) {
		System.out.println("You can't insert another Nickel");
	}
 
	public void ejectQuarter() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getInsufficientCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
		//System.out.print("111111111");
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public boolean isGumballInSlot(){
       return false;
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
