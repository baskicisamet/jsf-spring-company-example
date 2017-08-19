package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Employee;
import repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Transactional
	public void insert(Employee employee) {
		
		employeeRepository.save(employee);
		
	}
	
	@Transactional
	public Employee get(long id) {
		
		
		return (Employee) employeeRepository.getById(id);
	}

	@Transactional
	public void delete(long id) {
		
		employeeRepository.deleteById(id);
		
	}

	@Transactional
	public void update(Employee employee) {
	
		employeeRepository.update(employee);
		
	}
	@Transactional
	public List<Employee> getAll() {
		
		return employeeRepository.getAll();
	}

}
