package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTestSuit {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private SearchingFacade searchingFacade;

    @Test
    public void testSearchingFacade() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        //Then
        try {
            searchingFacade.searchCompany("oft");
        } catch (SearchProcessingException e) {
            //
        }

        try {
            searchingFacade.searchEmployee("oh");
        } catch (SearchProcessingException e) {
            //
        }

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
        } catch (Exception e) {
            //do nothing
        }
    }
}