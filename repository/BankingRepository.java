package BankingAPI.BankingAPI.repository;

import BankingAPI.BankingAPI.model.Banking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingRepository extends CrudRepository<Banking, Long> {

}
