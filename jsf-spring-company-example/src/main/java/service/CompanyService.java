package service;

import java.util.List;

import domain.Company;


public interface CompanyService {

	public void insert(Company company);
	public Company get(long id);
	public void delete(long id);
	public void update(Company company);
	public List<Company> getAll();
	
}
