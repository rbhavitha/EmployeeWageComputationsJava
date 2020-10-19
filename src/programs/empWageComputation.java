package programs;
import utility.EmpWageObject;
import utility.Utilities;

/**@author Bhavitha
  *Create Date   : 19th October 2020
  *Functionality : Employee Wage Computations
  */
public class empWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation \n");
        //To calculate employee wage for multiple companies.
        Utilities company1Details=new Utilities();
        EmpWageObject empObject=new EmpWageObject();
        empObject.setCompany("Reliance");
        empObject.setEmpRatePerHr(20);
        empObject.setNumWorkingDays(20);
        empObject.setMaxWorkingHrs(100);
        company1Details.Wage(empObject.getCompany(),empObject.getEmpRatePerHr(),empObject.getNumWorkingDays(),empObject.getMaxWorkingHrs());

        Utilities company2Details=new Utilities();
        empObject.setCompany("D-Mart");
        empObject.setEmpRatePerHr(20);
        empObject.setNumWorkingDays(25);
        empObject.setMaxWorkingHrs(100);
        company2Details.Wage(empObject.getCompany(),empObject.getEmpRatePerHr(),empObject.getNumWorkingDays(),empObject.getMaxWorkingHrs());
    }

}

