package service;

import java.util.List;

import domain.Address;
import domain.Company;

public interface AddressService {

	
	public void insert(Address address);
	public Address get(long id);
	public void delete(long id);
	public void update(Address adress);
	public List<Address> getAll();
}
