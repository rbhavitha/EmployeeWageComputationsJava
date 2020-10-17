package utility;
/**@author Bhavitha
 * Create Date   : 17th October 2020
 * Functionality : This utility file contains logic of code for src.
 */

public class Utilities {
    int is_Present = 1;
    int empRatePerHr = 20;
    int numWorkingDays = 20;
    int isFullTime = 1;
    int isPartTime = 2;
    int totalSalary = 0;
    /*
    @Functionality - calculates employee wage until given condition reached.
    @returns       - total salary
    */
        public int empWageCondition(){
            int totalempHrs=0;
            int totalempWorkDays=0;
            int maxWorkingHrs=100;
            int empHrs;
            while (totalempHrs<maxWorkingHrs && totalempHrs<numWorkingDays){
                double empCheck= Math.floor(Math.random() * 10) % 3;
                switch ((int) empCheck){
                    case 1:
                        empHrs=8;
                        totalempHrs=totalempHrs+empHrs;
                    case 2:
                        empHrs=4;
                        totalempHrs=totalempHrs+empHrs;
                    default:
                        empHrs=0;
                }
            }
            return totalSalary+(totalempHrs*empRatePerHr);
        }
}