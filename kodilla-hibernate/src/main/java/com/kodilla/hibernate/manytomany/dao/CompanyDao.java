package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query
    List<Company> retrieveCompaniesWithFirstThreeLetter(@Param("COMPANY_NAME") String firstThreeLetters);
    @Query
    List<Company> retrieveCompaniesInclude(@Param("PART_OF_COMPANY_NAME") String partOfCompanyName);
}
