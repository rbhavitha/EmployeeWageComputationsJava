package programs;
import utility.EmpWageObject;
import utility.Utilities;
import java.util.ArrayList;

/**@author Bhavitha
  *Create Date   : 19th October 2020
  *Modified Date : 22nd OCtober 2020
  *Functionality : Employee Wage Computations
  */
public class empWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation \n");

        // To calculate employee wage for multiple companies.
        Utilities utility=new Utilities();
        EmpWageObject company1=new EmpWageObject("Dmart",    20,20,100);
        utility.Wage(company1.getCompany(),company1.getEmpRatePerHr(),company1.getNumWorkingDays(),company1.getMaxWorkingHrs());

        EmpWageObject company2=new EmpWageObject("Reliance", 25,30,100);
        utility.Wage(company2.getCompany(),company2.getEmpRatePerHr(),company2.getNumWorkingDays(),company2.getMaxWorkingHrs());

        EmpWageObject company3=new EmpWageObject("Grofers", 25,30,100);
        utility.Wage(company3.getCompany(),company3.getEmpRatePerHr(),company3.getNumWorkingDays(),company3.getMaxWorkingHrs());

        EmpWageObject company4=new EmpWageObject("BigBasket",30,10,100);
        utility.Wage(company4.getCompany(),company4.getEmpRatePerHr(),company4.getNumWorkingDays(),company4.getMaxWorkingHrs());

        ArrayList<EmpWageObject>list=new ArrayList<EmpWageObject>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);

        for (EmpWageObject emp : list)
            System.out.println(emp);

    }

}

