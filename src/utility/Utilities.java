package utility;

/**@author Bhavitha
 * Create Date   : 17th October 2020
 * Functionality : This utility file contains logic of code for src.
 */
public class Utilities {
    /*
    @Functionality : checks if employee is present or absent
     */
    public int CheckEmpAttendance(){
        int is_Present=1;
        double randomCheck=Math.floor(Math.random()*10)%2;
        if (is_Present == randomCheck)
            return 1;
        return 0;
    }
}
