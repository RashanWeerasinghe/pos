package com.bootcamp.pos.EzyPOS.service.impl;

import com.bootcamp.pos.EzyPOS.dto.RequestDTO.CustomerDTO;
import com.bootcamp.pos.EzyPOS.enitiy.Customer;
import com.bootcamp.pos.EzyPOS.repo.CustomerRepo;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public String saveCustomer(CustomerDTO dto) {

        Customer c1=new Customer("1D", dto.getName(),dto.getAddress(),dto.getSalary());

        customerRepo.save(c1);
        return c1.getId()+" Saved!";
    }

    @Override
    public String findCustomer(String id) {
        return null;
    }

    @Override
    public String updateCustomer(CustomerDTO dto, String id) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public String findAllCustomer() {
        return null;
    }
}
