package employeewagecomputation.service;

import employeewagecomputation.model.CompanyEmpWage;

public interface WageCalculator
{
    long calculateWage(CompanyEmpWage company);
}
