package programs;
import utility.Utilities;
/**@author Bhavitha
  *Create Date : 17th October 2020
  *Functionality : Employee Wage Computations
  */
public class empWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        Utilities utilities=new Utilities();
        //uc-1 check employee attendance
        double attendance = utilities.CheckEmpAttendance();
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }

}
