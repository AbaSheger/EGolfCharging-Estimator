
/**
* Assignment 1
* a program that calculates the charging time and power of an (e-golf) with a storage power of 35.8kwh
* and display it in a table format
* 1.Create variables and constants (finals)
* 2.Calculate charging power for the all the rows
* 3.Print the table headings and results 
* @author Abenezer Anglo, abeang-2
*/

class Main {
  public static void main(String[] args) {

     // Declare variables
    
    final int CURRENT1 = 10;
    
    final int CURRENT2= 16;
    
    final int CURRENT3 = 32;
    
    final int VOLTAGE1 = 230;
    
    final int VOLTAGE2 = 400;
    
    final double CAPACITY=35.8;

    /* calculate charging power for the first row and divide the result by 1000 to convert it to kilowatt */
    double chargingPower1 = CURRENT1 * VOLTAGE1;
    double chargingPowerKw1= chargingPower1/1000;

    // calculate charging time for the first row and round the result to two decimal places
    double chargingtime1= CAPACITY/chargingPowerKw1 ;
    chargingtime1 = Math.round(chargingtime1*100) ;
    chargingtime1= chargingtime1/100 ;
           
       /* calculate charging power for the second row and divide the result by 1000 to convert it to kilowatt */          
    double chargingPower2 = CURRENT2 *VOLTAGE1;
    double chargingPowerKw2= chargingPower2/1000 ;

    // calculate charging time for the second row and round the result to two decimal places
    double chargingtime2 = CAPACITY/ chargingPowerKw2;
    chargingtime2 = Math.round(chargingtime2*100) ;
    chargingtime2= chargingtime2/100 ;

    /* calculate charging power for the third row, divide the result by 1000 to convert it to kilowatt and round the result to two decimal places */ 
    double chargingPower3 = CURRENT1 * VOLTAGE2*Math.sqrt(3);
    double chargingPowerKw3= chargingPower3/1000 ;
          chargingPowerKw3= Math.round(chargingPowerKw3*100);
          chargingPowerKw3=chargingPowerKw3/100;
    // calculate charging time for the third row and round the result to two decimal places
    double chargingtime3 = CAPACITY/ chargingPowerKw3 ;
         chargingtime3 = Math.round(chargingtime3*100) ;
         chargingtime3= chargingtime3/100 ;
    /* calculate charging power for the forth row,divide the result by 1000 to convert it to kilowatt and round the result to two decimal places */ 
    double chargingPower4 = CURRENT2 *VOLTAGE2* Math.sqrt(3);
    double chargingPowerKw4= chargingPower4/1000 ;
            chargingPowerKw4= Math.round(chargingPowerKw4*100);
            chargingPowerKw4=chargingPowerKw4/100;
    // calculate charging time for the forth row and round the result to two decimal places
    double chargingtime4 = CAPACITY/ chargingPowerKw4 ;
            chargingtime4 = Math.round(chargingtime4*100) ;
            chargingtime4= chargingtime4/100 ;

    /* calculate charging power for the fifth row,divide the result by 1000 to convert it to kilowatt and round the result to two decimal places */ 
    double chargingPower5 = CURRENT3 *VOLTAGE2*Math.sqrt (3);
     double chargingPowerKw5= chargingPower5/1000 ;
            chargingPowerKw5= Math.round(chargingPowerKw5*100);
            chargingPowerKw5=chargingPowerKw5/100;
    // calculate charging time for the fifth row and round the result to two decimal places
    double chargingtime5 = CAPACITY/ chargingPowerKw5 ;
            chargingtime5 = Math.round(chargingtime5*100) ;
            chargingtime5= chargingtime5/100 ;
// print out the table header
  System.out.println("Batteri 35.8(kwh)") ;
 // print out the table Field Headings and the double dashed lines   
  System.out.println("Ström (A) \t Spänning(v) \t Laddeffekt(kW) \t Laddningstid(h)") ;
  System.out.println("================================================================") ;


    //print out first row of the table
    System.out.print(CURRENT1+ "\t\t\t\t");
    System.out.print(VOLTAGE1+ "\t\t\t\t") ;
    System.out.print(chargingPowerKw1+"\t\t\t\t\t" );
    System.out.println(chargingtime1 );
    
   // print out second row of the table
    System.out.print(CURRENT2+ "\t\t\t\t");
    System.out.print(VOLTAGE1+"\t\t\t\t");
    System.out.print(chargingPowerKw2+"\t\t\t\t");
    System.out.print(chargingtime2+"\n");
    
    // print out third row of the table
    System.out.print(CURRENT1+"\t\t\t\t") ;
    System.out.print(VOLTAGE2 +"\t\t\t\t" ) ;
     System.out.print(chargingPowerKw3+"\t\t\t\t") ;
    System.out.print(chargingtime3+"\n");

    // printout fourth row of the table
   System.out.print(CURRENT2+"\t\t\t\t") ;
    System.out.print(VOLTAGE2 +"\t\t\t\t") ;
    System.out.print(chargingPowerKw4 +"\t\t\t\t") ;
    System.out.print(chargingtime4 +"\n");

    // print out the fifth row of the table
    System.out.print(CURRENT3+ "\t\t\t\t") ;
    System.out.print(VOLTAGE2+"\t\t\t\t");
    System.out.print(chargingPowerKw5+ "\t\t\t\t");
    System.out.print(chargingtime5+"\t\t\t\t");
    
     
    

  

    
    
 
    
     
    
    
    
    

      
 
       

  }
}