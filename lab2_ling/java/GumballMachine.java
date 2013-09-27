

public class GumballMachine implements IGumballMachine {
 
    State soldOutState;
    //State noQuarterState;
    State insufficientCoinState;
    State hasQuarterState;
    State soldState;
 
    State state = soldOutState;
   // State state;
    boolean takeGumballFromSlot;
    boolean isGumballInSlot = false;
    int count = 0;
    int coin =0;
    boolean check;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
       // noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        insufficientCoinState = new InsufficientCoinState(this);
        
       //state = soldOutState;

        this.count = numberGumballs;
        isGumballInSlot = false;
        if (numberGumballs > 0) {
            state =  insufficientCoinState;
        }
        else
            state = soldOutState;
    }
    
    public void setGumballInSlot(boolean gumballInSlot){
    if (gumballInSlot == true){
        check = true;
        System.out.print("take the gumball");
    }
    else{
        check = false;
    }
    }
 
   
     public void insertQuarter() {
        state.insertQuarter(25);
        System.out.println(state.toString());
    }
    
    public void insertDime(){
        state.insertDime(10);
    }
     
    public void insertNickel(){
        state.insertNickel(5);
    }
    
    
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        //check = state.isGumballInSlot();
        //System.out.println(222222+state.toString());
        check = state.isGumballInSlot();
        //System.out.println(check);
        state.dispense();
       
        //check = state.isGumballInSlot();
        // System.out.println(222222+state.toString());
         // System.out.println(check);;
    }

    void setState(State state) {
       /*if (state==getInsufficientCoinState()){
           this.state = state;
           insufficientCoinState.setCoin(coin);
        }
        else*/
            this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");   
        if (count != 0) {
            count = count - 1;
            //System.out.println("count" + count); 
        }
       // System.out.println("55555555 count"+ count);
    }
    
    public boolean isGumballInSlot(){  
        
        return check;
    }
    
    public void takeGumballFromSlot(){
        
        if (isGumballInSlot = false){
            setState( insufficientCoinState);
        }
        else{
            System.out.println("please take the gumball");
            isGumballInSlot=false;
            setState( insufficientCoinState);
        }
        
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        System.out.println("refill "+count);
        state =insufficientCoinState;
        
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
     
    public State getInsufficientCoinState(){
        return insufficientCoinState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
