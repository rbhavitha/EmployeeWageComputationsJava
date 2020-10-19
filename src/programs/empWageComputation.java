package programs;
import utility.EmpWageObject;
import utility.Utilities;

/**@author Bhavitha
  *Create Date   : 19th October 2020
  *Functionality : Employee Wage Computations
  */
public class empWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        //uc-7 Refactor the code to write a class method to compute employee wage
        Utilities companyDetails=new Utilities();
        EmpWageObject empObject=new EmpWageObject();
        empObject.setCompany("LG");
        empObject.setEmpRatePerHr(20);
        empObject.setNumWorkingDays(20);
        empObject.setMaxWorkingHrs(100);
        companyDetails.WageHrs(empObject.getCompany(),empObject.getEmpRatePerHr(),empObject.getNumWorkingDays(),empObject.getMaxWorkingHrs());

    }

}

