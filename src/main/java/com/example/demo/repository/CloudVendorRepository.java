package com.example.demo.repository;

import com.example.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository <CloudVendor, String> {
    //write custom method if not in JPA
    List<CloudVendor> findByVendorName(String vendorName);

}

