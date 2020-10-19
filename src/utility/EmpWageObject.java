package utility;
/*
@author  :bhavitha
@Created Date : 19th october
@Functionality : contains objects
 */
public class EmpWageObject {
    private String company;
    private int empRatePerHr;
    private int numWorkingDays;
    private int maxWorkingHrs;

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
}
