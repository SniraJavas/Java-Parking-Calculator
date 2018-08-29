
package Main;

import java.text.ParseException;

/**
 * Calculator Mean
 * The class illustrates how to get the Balance of the USer after after the user 
 * have parked his/her car for some time.
 * It also indicate how to get a change after a user have paid some cash.
 * This class works in collaboration with ParkCalculator.
 * It consist of two functions.
 * @see ParkCalculator
 *
 * @author Sinikiwe Nangoku Jumba
 * @version 0.00, 7 Dec 2017
 */
public class CalculatorMain {
    private long [] Arr = new long[4];
    
    
   
 
        /**
     *
     * DueBalance method.
     * <br />
     * This method is calculates the money due to be paid by a customer.
     * 
     * @param Hour is a resultant difference of EntryTime and EndTime in hours
     *@return  double
     * @since version 0.00
     */
      public double DueBalance(long Hour){
        
        double Price = 0 ;
        //Prices are made depending on the hour taken by a customer.
        if(Hour >= 0 && Hour <=1 ){
             return 0 ; 
        }else if(Hour > 1 && Hour <=2 ){
            Price = 5 ;
        }else if(Hour > 2 && Hour <= 4){
            Price = 8 ;
        }else if(Hour > 4 && Hour <= 6){
            Price = 11 ;
        }else if(Hour > 6 && Hour <= 10){
            Price = 14 ;
        }else if(Hour > 10 && Hour <= 20){
            Price = 25 ;
        }else if(Hour > 20 && Hour <= 24){
            Price = 35 ;
        }else if(Hour > 24 ){
            Price = 50 ;
        }
        
        return Price;
    }
   
      /**
     *
     * CountChange method.
     * <br />
     * This method is calculates the change of the customer after it have payed its balance..
     * 
     * @param2 Payment money to be payed by a customer
     * @param1  PriceDue the money customer owes.
     *@return  double
     * @since version 0.00
     */
     double CountChange(double PriceDue, double Payment){
        if((Payment - PriceDue)< 0 ){
            return 0 ;
        }else{
            return (Payment - PriceDue); 
        }
    }
}
