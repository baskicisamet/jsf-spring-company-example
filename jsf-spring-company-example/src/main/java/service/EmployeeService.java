package service;

import java.util.List;

import domain.Employee;

public interface EmployeeService {
	
	public void insert(Employee employee);
	public Employee get(long id);
	public void delete(long id);
	public void update(Employee employee);
	public List<Employee> getAll();
	

}
