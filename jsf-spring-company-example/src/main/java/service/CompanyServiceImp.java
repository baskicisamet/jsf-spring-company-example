package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Company;
import repository.CompanyRepository;

@Service
public class CompanyServiceImp implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;
	
	
	@Transactional
	public void insert(Company company) {
		
		companyRepository.save(company);	
	}

	@Transactional
	public Company get(long id) {
		
		return (Company) companyRepository.getById(id);
	}

	
	@Transactional
	public void delete(long id) {
		
		companyRepository.deleteById(id);
	}

	
	@Transactional
	public void update(Company company) {
		
		companyRepository.update(company);
	}

	
	@Transactional
	public List<Company> getAll() {
	
		return companyRepository.getAll();
	}

	
}
