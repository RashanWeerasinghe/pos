package com.bootcamp.pos.EzyPOS.repo;

import com.bootcamp.pos.EzyPOS.enitiy.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AccountRepo extends JpaRepository<Account,Integer> {
}
