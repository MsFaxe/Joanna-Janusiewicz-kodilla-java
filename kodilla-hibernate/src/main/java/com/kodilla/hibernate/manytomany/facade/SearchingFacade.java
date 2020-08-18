package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public void searchCompany(String partOfCompanyName) throws SearchProcessingException {
        boolean wasError = false;
        LOGGER.info("Searching companies include \"" + partOfCompanyName + "\" in name");
        try {
            List<Company> companyList = companyDao.retrieveCompaniesInclude("%" + partOfCompanyName + "%");
            if (companyList.size() > 0) {
                for (Company company : companyList) {
                    LOGGER.info("Companies with \"" + partOfCompanyName + "\" in name: " + company.getName());
                }
            } else {
                LOGGER.error(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
                wasError = true;
            }
        } finally {
            if (wasError) {
                LOGGER.info("No companies includes \"" + partOfCompanyName + "\" in name");
            }
        }
    }

    public void searchEmployee(String partOfEmployeeName) throws SearchProcessingException {
        boolean wasError = false;
        LOGGER.info("Searching employees include \"" + partOfEmployeeName + "\" in name");
        try {
            List<Employee> employees = employeeDao.retrieveEmployeesInclude("%" + partOfEmployeeName + "%");
            if (employees.size() > 0) {
                for (Employee employee : employees) {
                    LOGGER.info("Employees with \"" + partOfEmployeeName + "\" in name: " + employee.getFirstname() + " " + employee.getLastname());
                }
            } else {
                LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
                wasError = true;
            }
        } finally {
            if (wasError) {
                LOGGER.info("No employee includes \"" + partOfEmployeeName + "\" in name");
            }
        }
    }
}
