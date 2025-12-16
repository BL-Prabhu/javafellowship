package employeewagecomputation;

public class EmployeeWageComputationMain {
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompany("TCS", 80, 20, 100);
        empWageBuilder.addCompany("INFOSYS", 100, 22, 120);
        empWageBuilder.addCompany("AMAZON", 120, 26, 130);


        empWageBuilder.computeWages();
    }
}
