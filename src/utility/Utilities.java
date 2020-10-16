package utility;

/**@author Bhavitha
 * Create Date   : 17th October 2020
 * Functionality : This utility file contains logic of code for src.
 */
public class Utilities {
    int is_Present=1;
    double randomCheck=Math.floor(Math.random()*10)%2;
    /*
    @Functionality : checks if employee is present or absent
     */
    public int CheckEmpAttendance(){
        if (is_Present == randomCheck)
            return 1;
        return 0;
    }

    /*
    @Functionality - calculates the daily employee wage
    @return        - if employee is present return wage else return 0
    */
    public int DailyEmpWage(){
        int empRatePerHr=20;
        int empHrs=8;
        int wage;
        if ( is_Present == randomCheck)
            return wage=empRatePerHr*empHrs;
        else
            return 0;
    }
}
