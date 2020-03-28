package BankingAPI.BankingAPI.service;

import BankingAPI.BankingAPI.model.Banking;
import BankingAPI.BankingAPI.repository.BankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BankingService {
    @Autowired
    BankingRepository bankingRepository;

    public List<Banking>getAllBanking(){
        List<Banking> listOfBanking = new ArrayList<>();
        bankingRepository.findAll().forEach(listOfBanking::add);
        return listOfBanking;

    }

    public void addBanking(Banking banking){
        bankingRepository.save(banking);
    }

    public void deleteBanking(Long id){
        bankingRepository.deleteById(id);
    }
    public Optional<Banking> getBankingByID(Long id){

        return bankingRepository.findById(id);
    }

    public void updateBanking(Long id, Banking banking) {
        bankingRepository.save(banking);
    }
}

