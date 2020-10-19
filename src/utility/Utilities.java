package utility;
/**@author Bhavitha
 *@ Create Date   : 17th October 2020
 * @Functionality : This utility file contains logic of code for src.
 */
public class Utilities {
    int empHrs;
    /*
    @Fucntionality          : This method contains logic for calculating
                              employee wage for companies
    @param company          : first input argument
    @param empRatePerHr     : second input argument
    @param numWorkingDays   : third input argument
    @param maxWorkingHrs    :fourth input argument
    @return                 : returns the total employee wage
     */
    public void Wage(String company,int empRatePerHr,int numWorkingDays,int maxWorkingHrs){
            int totalEmpHrs=0;
            int totalWage=0;
            int totalWorkingDays=0;
            while (totalEmpHrs<maxWorkingHrs && totalWorkingDays<numWorkingDays){
                double empCheck= Math.floor(Math.random() * 10) % 3;
                switch ((int) empCheck){
                    case 1:
                        empHrs=8;
                        break;
                    case 2:
                        empHrs=4;
                        break;
                    default:
                        empHrs=0;
                        break;
                }
                totalWorkingDays=totalWorkingDays+1;
                totalEmpHrs=totalEmpHrs+empHrs;
                totalWage=totalEmpHrs*empRatePerHr;
            }
            System.out.println("Company Name:" +company);
            System.out.println("Employee Working Hours:" +totalEmpHrs);
            System.out.println("Employee Wage:" +totalWage+ "\n");
    }
}    
