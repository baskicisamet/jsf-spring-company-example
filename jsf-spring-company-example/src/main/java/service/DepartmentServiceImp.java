package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Department;
import repository.DepartmentRepository;
@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Transactional
	public void insert(Department department) {
		
		departmentRepository.save(department);
	}
	
	
	@Transactional
	public Department get(long id) {
		
		return (Department) departmentRepository.getById(id);
	}

	
	@Transactional
	public void delete(long id) {
		
		departmentRepository.deleteById(id);
	}

	
	@Transactional
	public void update(Department department) {
		
		departmentRepository.update(department);
		
	}

	
	@Transactional
	public List<Department> getAll() {
		
		return departmentRepository.getAll();
	}

}
