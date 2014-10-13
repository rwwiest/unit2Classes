

/**
 * The Car class tracks the fuel remaining in the car as it is driven based on the fuel efficiency.
 * 
 * @author (Riley Wiest) 
 * @version (9/12/14)
 */
public class Car
{
    /** the fuel effeiciency of this car measured in miles per gallon*/
    private double fuelEfficiency;
    
    /** the number of gallons of fuel left in this car's tank*/
    private double fuelInTank;

    /**
     * Constructor for a car of the sepcified fule efficiency.
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank.
     *
     * @pre        specified number of gallons doesn't exceed this car's tank's capacity
     *            
     * @param    gallons        number of gallons of fuel t oadd to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }


    /**
     * Updates the fuel in this car;s tank based on the specified 
     * number of miles  driven and this car's fuel efficiency
     *
     * @pre     the specified number of miles doesn't consume more than the fuel in this car's tank
     * @param   miles number of miles this car has driven
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles/this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}
