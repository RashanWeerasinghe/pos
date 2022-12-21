package com.bootcamp.pos.EzyPOS.api;

import com.bootcamp.pos.EzyPOS.api.DTO.RequestDTO.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping("/save")
    public String save(@RequestBody CustomerDTO dto){
         return dto.toString();
    }

    @GetMapping("/read/{id}")
    public String readCustomer(@PathVariable int id){
      return id+" - customer";
    }


    @PutMapping(value = "/update",params = {"id"})
    public String update(@RequestBody CustomerDTO dto,@RequestParam String id){
        return dto.toString()+" - id -"+id;
    }

    @DeleteMapping("/delete/{id}")
    public String Delete(@PathVariable String id){
          return id+" -id-";
    }
}
