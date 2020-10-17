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

        //uc-6 calculate wage until total working hours or days reached.
        int empWageCondition=utilities.empWageCondition();
        System.out.println("Salary of emp after condition reached: "+empWageCondition);
    }

}

