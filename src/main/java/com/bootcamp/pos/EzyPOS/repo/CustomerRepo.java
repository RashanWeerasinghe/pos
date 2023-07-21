package com.bootcamp.pos.EzyPOS.repo;

import com.bootcamp.pos.EzyPOS.enitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


@EnableJpaRepositories
public interface CustomerRepo  extends JpaRepository<Customer,String> {


}
