

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class Vending_MachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_MachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
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
    public void getCanCount()
    {
        Vending_Machine machine = new Vending_Machine(20,20);
        int cans = machine.getCanCount();
        assertEquals(20,cans, 1e-6);
    }
    @Test
    public void getTokenCount()
    {
        Vending_Machine machine = new Vending_Machine(20,20);
        int coins = machine.getTokenCount();
        assertEquals(20,coins, 1e-6);
    }
    @Test
    public void insertToken()
    {
        Vending_Machine machine = new Vending_Machine(20,20);
        machine.insertToken(5);
        int coins = machine.getTokenCount();
        int cans = machine.getCanCount();
        assertEquals(15,cans, 1e-6);
        assertEquals(25,coins, 1e-6);
    }
    @Test
    public void fillUp()
    {
        Vending_Machine machine = new Vending_Machine(20,20);
        machine.fillUp(30);
        int cans = machine.getCanCount();
        assertEquals(50,cans, 1e-6);
    }
}
