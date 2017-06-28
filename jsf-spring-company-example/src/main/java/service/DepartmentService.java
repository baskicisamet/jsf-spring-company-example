package service;

import java.util.List;

import domain.Department;

public interface DepartmentService {

	public void insert(Department department);
	public Department get(long id);
	public void delete(long id);
	public void update(Department department);
	public List<Department> getAll();
	
	
}
