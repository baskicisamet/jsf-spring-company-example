package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Address;
import domain.Company;
import repository.AddressRepository;

@Service
public class AddressServiceImp implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Transactional
	public void insert(Address address) {
		
		addressRepository.save(address);
		
	}

	public Address get(long id) {
		
		return (Address) addressRepository.getById(id);
	}

	public void delete(long id) {
		
		addressRepository.deleteById(id);
	}

	public void update(Address adress) {
		
		addressRepository.update(adress);
		
	}

	public List<Address> getAll() {
		
		return addressRepository.getAll();
	}
	
	

}
