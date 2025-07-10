package com.example.demo.coontroller;

import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return  cloudVendor;
//                CloudVendor("c1","vendor1","Address one","765437");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor deleted";
    }
}
