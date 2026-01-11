package employeewagecomputation;

import employeewagecomputation.attendance.RandomAttendancePolicy;
import employeewagecomputation.model.CompanyEmpWage;
import employeewagecomputation.repository.CompanyRepository;
import employeewagecomputation.service.CompanyWageCalculator;
import employeewagecomputation.service.WageCalculator;

public class EmployeeWageComputationMain
{
    public static void main(String[] args) {

        CompanyRepository repository = new CompanyRepository();

        repository.addCompany(new CompanyEmpWage("TCS", 80, 20, 100));
        repository.addCompany(new CompanyEmpWage("INFOSYS", 100, 22, 120));
        repository.addCompany(new CompanyEmpWage("AMAZON", 120, 26, 130));

        WageCalculator calculator =
                new CompanyWageCalculator(new RandomAttendancePolicy());

        for (CompanyEmpWage company : repository.getAllCompanies()) {
            long wage = calculator.calculateWage(company);
            company.setTotalWage(wage);
            System.out.println(company);
            System.out.println("--------------------------------");
        }
    }
}
