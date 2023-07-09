package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.Address;
import com.example.EcommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address Added successfully!!!";
    }
}
