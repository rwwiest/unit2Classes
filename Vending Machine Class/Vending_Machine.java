/**
 * This Vending_Machine class can take in tokens and give away or add cans of soda
 * also the class allows you to check the current total of cans or total of tokens in the 
 * machine
 * 
 * @Riley Wiest 
 * @9/19/14
 */
public class Vending_Machine
{
/**
 * the token instance variable keeps track of the total number of tokens in the machine
 * the total_cans instance variable keeps track of the total number of cans in the machine
 */    
private int token;
private int total_cans;

public Vending_Machine(int token,int total_cans)
{
    this.token = token;
    this.total_cans = total_cans;
}
public void fillUp(int cans)
{
    this.total_cans = this.total_cans + cans;
}    
public void insertToken(int coin)
{
    this.token = this.token + coin;
    this.total_cans = this.total_cans - coin;
}    
public int getCanCount()
{
    return this.total_cans;
}
public int getTokenCount()
{
    return this.token;
}
}