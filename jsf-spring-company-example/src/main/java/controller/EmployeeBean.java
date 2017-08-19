package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import domain.Department;
import domain.Employee;
import service.EmployeeService;

@ManagedBean(name="employeeBean")
@ViewScoped
public class EmployeeBean implements Serializable {

	@ManagedProperty("#{employeeServiceImp}")
	transient EmployeeService employeeService;

	
	
	
	private long id;
	private String name;
	private String surname;
	private Department department;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
	
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public List<Employee> getAll(){
		
		
		
		List<Employee> employees =  employeeService.getAll();
		
		System.out.println(employees.size()+" ");
		
		/*############################### Test initiazing*/
//		List<Employee> employees = new ArrayList<Employee>();
//		
//		Employee employee1 = new Employee();
//		employee1.setId(1);
//		employee1.setName("samet");
//		employee1.setSurname("Bask�c�");
//		
//		Employee employee2 = new Employee();
//		employee2.setId(1);
//		employee2.setName("james");
//		employee2.setSurname("Gosling");
//		
//		Employee employee3 = new Employee();
//		employee3.setId(1);
//		employee3.setName("kevin");
//		employee3.setSurname("Mitnick");
//		
//		employees.add(employee1);
//		employees.add(employee2);
//		employees.add(employee3);
		/*############################### Test initiazing*/
		
		return employees;
	}
	
	
}
