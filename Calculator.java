
package Main;

/**
 * Calculator Class
 * This class works hand in hand with class ParkCalculator. It calculates the 
 * difference of given Times in Hours and calculates the Change of the customer
 * in an optimized way.  
 * 
 * @see ParkCalculator
 *
 * @author Sinikiwe Nangoku Jumba
 * @version 0.00, 7 Dec 2017
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculator  {

    /**
     *
     * CountChange method.
     * <br />
     * This method is calculates the change of the customer after it have payed its balance..
     * 
     * @param2 EntryTime the time a user will arrive at the Parking.
     * @param1  EndTime the time a user will leave parking
     *@return  long Array which contain other values which might be in need in the future. 
     * @since version 0.00
     */
    long [] TimeDifference(String EntryTime, String EndTime) throws ParseException{
            long []Array = new long[4];
            SimpleDateFormat DefineFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm"); /// ("MM/dd/yyyy HH:mm:ss")
            
            Date d1 = DefineFormat.parse(EntryTime);
            Date d2 = DefineFormat.parse(EndTime);

	    //in milliseconds
	     long diff = d2.getTime() - d1.getTime();
             
	     long diffSeconds = diff / 1000 % 60;
             Array[0] = diffSeconds ;
             
	     long diffMinutes = diff / (60 * 1000) % 60;
             Array[1] = diffMinutes ;
             
             long diffHours = diff / (60 * 60 * 1000) % 24; // Calculates hours from the miniseconds diffrence
             Array[2] = diffHours; // storing hour into array[2]
             
	     long diffDays = diff / (24 * 60 * 60 * 1000);
             Array[3] = diffDays ;
               
          return Array ;
    }
    /**
     *
     * CountChange method.
     * <br />
     * This method is calculates the change of the customer after it have payed its balance. In an optimized way.

     * @param1  Amount the money that needs a change.
     *@return  String it returns the change in the form of a string o
     * @since version 0.00
     */
    String CalculateChange(double Amount){
           
        String Str = " ";
        //___________________The following part will count the number of possible coins to make an optimesd Change in Double _____________
        
        double TenCent , TwentyCent, FiftyCent, OneRand, TwoRand, FiveRand, TenRand, TwentyRand, FiftyRand, OneHundrad, TwoHundrad ;
        
        TwoHundrad = Amount/200;
        Amount = Amount % 200 ;
        int IntTwoHundrad = (int)TwoHundrad;
        
        OneHundrad = Amount/100;
        Amount = Amount%100 ;
        int IntOneHundrad = (int)OneHundrad;
        
        FiftyRand = Amount/50;
        Amount = Amount%50;
        int IntFiftyRand  = (int)FiftyRand;
        
        
        TwentyRand = Amount/20;
        Amount = Amount%20;
        int IntTwentyRand = (int)TwentyRand ;
        
        TenRand = Amount/10;
        Amount = Amount%10;
        int IntTenRand = (int)TenRand;
        
        FiveRand = Amount/5;
        Amount = Amount%5;
        int IntFiveRand = (int)FiveRand;
        
        TwoRand = Amount/2;
        Amount = Amount%2;
        int IntTwoRand = (int)TwoRand;
        
        OneRand = Amount/1; 
        Amount = Amount %1;
        int IntOneRand = (int)OneRand;
        
        FiftyCent = Amount/0.50 ;
        Amount = Amount%0.50;
        int IntFiftyCent = (int)FiftyCent ;
        
        
        TwentyCent = Amount/0.20 ;
        Amount = Amount%0.20;
        int IntTwentyCent = (int)TwentyCent; 
        
        TenCent = Amount/0.10 ;
        Amount = Amount%0.10;
        int IntTenCent = (int)TenCent;
        
        //_____________________Converting the Doule which have been achieved from the top of this function into Int______________________________
        
        if(IntTwoHundrad != 0){
            Str +=  Integer.toString(IntTwoHundrad)+ " x R200 \n";
            
        }else if(IntOneHundrad != 0){
            Str += Integer.toString(IntOneHundrad)+ " x R100 \n";
            
        }else if(IntFiftyRand != 0){
            Str += Integer.toString(IntFiftyRand)+ " x R50 \n";
            
        }else if(IntTwentyRand != 0){
            Str +=Integer.toString(IntTwentyRand)+ " x R20  + \n";
        
        }else if(IntTenRand != 0){
            Str += Integer.toString(IntTenRand)+ " x R10 \n";
        
        }else if(IntFiveRand != 0){
            Str += Integer.toString(IntFiveRand)+ " x R5 \n";
        
       }else if(IntTwoRand != 0){
           Str += Integer.toString(IntTwoRand)+ " x R2 \n";
           
       }else if(IntOneRand != 0){
            Str += Integer.toString(IntOneRand)+ " x R1 \n";
            
        }else if(IntFiftyCent != 0){
            Str +=Integer.toString(IntFiftyCent)+ " x 50c \n";
            
        }else if(IntTwentyCent != 0){
           Str +=  Integer.toString(IntTwentyCent)+ " x 20c \n" ;
        
        }else if(IntTenCent != 0){
            Str += Integer.toString(IntTenCent)+ " x 10c : " ;
        }
        
        //System.out.println(" 10c : " +IntTenCent + "\n 20c : " +IntTwentyCent+ "\n 50c : " +IntFiftyCent +"\n R1 : " + IntOneRand +"\n R2 : " +IntTwoRand + "\n R5 : " + IntFiveRand +"\n R10 : " + IntTenRand +"\n R2 :  " +IntTwentyRand +"\n R50 : " +IntFiftyRand + "\n R100 : "+ IntOneHundrad +"\n R200 : " +IntTwoHundrad);
        
        return Str ;
    
    
    }
 
}
