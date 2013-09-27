

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    GumballMachine m1;
       GumballMachine m2;
       GumballMachine m3;
       GumballMachine m4;
       GumballMachine m5;   

    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
    {        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        m1 = new GumballMachine(5);
        m2 = new GumballMachine(0);
        m3 = new GumballMachine(2);
        m4 = new GumballMachine(1);
        m5 = new GumballMachine(2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

     @Test
    public void hasQuarter()
    {
       System.out.println("");
        System.out.println("Test1: the Gumball Machine accept quarter");
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
      
        assertEquals(true, m1.isGumballInSlot());
    }

    @Test
    public void hasDimeQuarterNickel()
    {
        System.out.println("");
        System.out.println("Test2: the Gumball Machine accept dime, quarter and Nickel;");
        m1.insertDime();
        m1.insertDime();       
        m1.insertNickel();
        m1.insertQuarter();
        m1.turnCrank();
        assertEquals(true, m1.isGumballInSlot());
    }

   
    

    @Test
    public void soldOut()
    {
        System.out.println("");
        System.out.println("Test3: the Gumball Machine is sold out");
        m2.insertDime();
        m2.turnCrank();
        assertEquals(false, m2.isGumballInSlot());
    }

    

    @Test
    public void checkCount()
    {
        System.out.println("");
        System.out.println("Test4: the Gumball Machine is sold out during sold state");
        m3.insertDime();
        m3.insertNickel();
        m3.insertNickel();
        m3.insertNickel();
        m3.insertNickel();
        m3.insertNickel();
        m3.insertQuarter();
        m3.turnCrank();
        m3.takeGumballFromSlot(); // play first time
        m3.insertQuarter();
        m3.insertQuarter();
        m3.turnCrank();
        m3.takeGumballFromSlot();//play second time
        m3.insertQuarter();
        m3.insertQuarter();
        m3.turnCrank();
        assertEquals(false, m3.isGumballInSlot());
    }

    @Test
    public void haveNotEnoughCoins()
    {
        System.out.println("");
        System.out.println("Test5: have not enough coin to buy");
        m1.insertNickel();
        m1.insertDime();
        m1.insertQuarter();
       // System.out.println(m1.getState().toString());
        m1.turnCrank();
        assertEquals(false, m1.isGumballInSlot());
    }

    @Test
    public void hasNoCoin()
    {   
         System.out.println("");
        System.out.println("Test6: crack without coin");
        m1.turnCrank();
        assertEquals(false, m1.isGumballInSlot());
    }

    @Test
    public void refillGumballMachine()
    {
         System.out.println("");
        System.out.println("Test7:refill the gumball machine and play it again");
        m2.insertQuarter();       
        m2.turnCrank(); // no gumball in the machine
        
        m2.refill(2);//refill gumball Machine
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        assertEquals(true, m2.isGumballInSlot());
    }

   

    /*@Test
    public void playTwice()
    {  
         System.out.println("");
        System.out.println("Test8:play twince at one time");
        m3.insertQuarter();
        m3.insertQuarter();
        m3.turnCrank();
        m3.takeGumballFromSlot();// play first time and take the gumball
        m3.insertQuarter();
       m3.insertQuarter();
        m3.turnCrank();// play second time
        assertEquals(true, m1.isGumballInSlot());
       
    }*/
    
     @Test
    public void soldout5()
    {
         System.out.println("");
        System.out.println("Test8:play twince at one time");
        m5.insertQuarter();
        m5.insertQuarter();
        m5.turnCrank();
        m5.takeGumballFromSlot();
        m5.insertQuarter();
        m5.insertQuarter();
        m5.turnCrank();
        assertEquals(true, m5.isGumballInSlot());
    }

    @Test
    public void ejectQuarter()
    {
         System.out.println("");
        System.out.println("Test9:insert enough coins and eject all coins");
        m1.insertQuarter();
        m1.insertQuarter();
        m1.ejectQuarter();
        m1.turnCrank();
        assertEquals(false, m1.isGumballInSlot());
    }

    @Test
    public void hasGumballInSlot()
    {
        System.out.println("");
        System.out.println("Test10:there is a gumball in the slot, pick it directly");
        m2.setGumballInSlot(true);
        assertEquals(true, m2.isGumballInSlot());
    }

    /*@Test
    public void testsoldout()
    {
        m4.insertQuarter();
        m4.insertQuarter();
        m4.turnCrank();
        m4.insertQuarter();
        m4.insertQuarter();
        m4.turnCrank();
        assertEquals(false, m4.isGumballInSlot());
    }
    
    @Test
    public void playTwice2()
    {  
         System.out.println("");
        System.out.println("Test8:play twince at one time");
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.takeGumballFromSlot();// play first time and take the gumball
        m1.insertQuarter();
        m1.insertNickel();
        m1.insertNickel();
        m1.insertNickel();
        m1.insertNickel();
        m1.insertDime();
        m1.turnCrank();// play second time
        assertEquals(true, m1.isGumballInSlot());
       
    }

    @Test
    public void testsoldout3()
    {
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.takeGumballFromSlot();
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.takeGumballFromSlot();
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.takeGumballFromSlot();
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.takeGumballFromSlot();
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        assertEquals(true, m1.isGumballInSlot());
    }*/

   
}




















