package utility;

/**@author Bhavitha
 * Create Date   : 17th October 2020
 * Functionality : This utility file contains logic of code for src.
 */
public class Utilities {
    int is_Present=1;
    int empRatePerHr=20;
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
        int empHrs=8;
        if ( is_Present == randomCheck)
            return empRatePerHr*empHrs;
        else
            return 0;
    }
    /*
    @Functionality - calculates the part time employee wage
    @return        - if employee is present return partTimeWage else return 0
    */
    public int PartTimeEmpWage(){
        int empHrs=4;
        if (is_Present == randomCheck)
            return empRatePerHr*empHrs;
        return 0;
    }
}
