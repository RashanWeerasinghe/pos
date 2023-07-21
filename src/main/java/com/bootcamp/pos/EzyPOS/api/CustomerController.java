package com.bootcamp.pos.EzyPOS.api;

import com.bootcamp.pos.EzyPOS.dto.RequestDTO.CustomerDTO;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @PostMapping("/trans")
    public String Trans(@RequestBody int value){
         return customerService.Transaction(value);
    }
//
//    @GetMapping("/read/{id}")
//    public String readCustomer(@PathVariable int id){
//      return id+" - customer";
//    }
//
//
//    @PutMapping(value = "/update",params = {"id"})
//    public String update(@RequestBody CustomerDTO dto,@RequestParam String id){
//        return dto.toString()+" - id -"+id;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String Delete(@PathVariable String id){
//          return id+" -id-";
//    }
}
