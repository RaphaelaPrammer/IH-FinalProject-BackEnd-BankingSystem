package com.ironhack.bankingsystemapp.repositories.accounts;

import com.ironhack.bankingsystemapp.models.accounts.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount,Long> {
}
