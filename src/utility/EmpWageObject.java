package utility;
/*
@author         :  bhavitha
@Created Date   : 19th October
*Modified Date  : 22nd October 2020
@Functionality  : contains constructors,getter &setter
                  methods for objects
 */
public class EmpWageObject {
    private String company;
    private int empRatePerHr;
    private int numWorkingDays;
    private int maxWorkingHrs;

    public EmpWageObject(String company,int empRatePerHr,int numWorkingDays,int maxWorkingHrs) {
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numWorkingDays=numWorkingDays;
        this.maxWorkingHrs=maxWorkingHrs;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public int getEmpRatePerHr(){
        return empRatePerHr;
    }
    public void setEmpRatePerHr(int empRatePerHr){
        this.empRatePerHr=empRatePerHr;
    }
    public int getNumWorkingDays(){
        return numWorkingDays;
    }
    public void setNumWorkingDays(int numWorkingDays){
        this.numWorkingDays=numWorkingDays;
    }
    public int getMaxWorkingHrs(){
        return maxWorkingHrs;
    }
    public void setMaxWorkingHrs(int maxWorkingHrs){
        this.maxWorkingHrs=maxWorkingHrs;
    }

    @Override
    public String toString() {
        return "EmpWageObject{" +
                "company='" + company + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", numWorkingDays=" + numWorkingDays +
                ", maxWorkingHrs=" + maxWorkingHrs +
                '}';
    }
}
