package employeewagecomputation.repository;

import employeewagecomputation.model.CompanyEmpWage;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepository
{
    private final List<CompanyEmpWage> companies = new ArrayList<>();

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public List<CompanyEmpWage> getAllCompanies() {
        return companies;
    }
}
