package edu.pdx.cs410J.wyat2;

//import edu.pdx.cs410J.wyat2*;

import java.util.ArrayList;
                                                                                    
/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class LeapYear {
                                                                                    
  private int year;
  private boolean isLeapYear;

  public boolean CheckLeapYear(){
    if(year % 4 != 0){
      return false;
    }
    if(year % 400 == 0){
      return true;
    }
    if(year % 100 == 0){
      return true;
    }
    return true;


  }

  public LeapYear(int yr){
    year = yr;
    isLeapYear = CheckLeapYear();
  }

  public boolean getResult(){
    return isLeapYear;
  }



  public static void main(String[] args) {
    //System.err.println("Missing command line arguments");
    //take one arg as string, then convert to int
    int year = Integer.parseInt(args[0]);
    LeapYear data1 = new LeapYear(year);

    System.out.println( data1.getResult() );

    System.exit(1);
  }
}