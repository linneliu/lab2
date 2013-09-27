

public interface State {
 
	public void insertQuarter(int quarter);
	public void insertDime(int dime);
	public void insertNickel(int nickel);
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	boolean isGumballInSlot() ;
	//
    //void takeGumballFromSlot( ) ;
}
