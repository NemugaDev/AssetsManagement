package co.assets;

import java.util.function.Consumer;

/**
 * 
 * Hello world!
 * 
 * Assets        100
 * Lab Machine   50,000(debit)//Assets
 * Cash          50,000(credit)
 * 
 *  10,000
 * 
 * Account       Debit        Credit
 * Lab Machine   50000     
 * Cash                       50000
 * 
 * Lab De                     10000
 * Depreciating  10000
 * 
 * Lab De                     8000
 * Depreciating  8000
 * 
 * Lab De                     5000
 * Depreciating  5000
 * 
 * Disposed ac                10000              
 * Debit         10,000
 *               
 * Supplier abc               20000
 * computer      20000            
 * 
 * 
 * 
 * 
 */
interface Calculator
{
	//void calc(int input);
	int add(int x,int y);
}
public class App 
{
	Consumer consumer;
	public void addData(String data)
	{
	 //git pull origin main (Pull updated code from 
		
	}
    public static void main( String[] args )
    {

        Calculator cacl=(x,y)->x+y;
        int x=cacl.add(2,3);
        System.out.println("x:"+x);
    }
}
